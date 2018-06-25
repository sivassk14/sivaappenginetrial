package Avro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
//import org.json.simple.JSONObject;

public class AvroExampleWithCodeGeneration {
    public void serialize() throws JsonParseException, JsonProcessingException, IOException {

        InputStream in = new FileInputStream("/home/sivakumar/Documents/Work/tools/Avro/StudentActivity.json");

        // create a schema
        Schema schema = new Schema.Parser().parse(new File("/home/sivakumar/Documents/Work/tools/Avro/StudentActivity.avsc"));
        // create an object to hold json record
        StudentActivity sa = new StudentActivity();
        // create an object to hold course_details
        Activity a = new Activity();

        // this file will have AVro output data
        File AvroFile = new File("resources/StudentActivity.avro");
        // Create a writer to serialize the record
        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<GenericRecord>(schema);
        DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(datumWriter);

        dataFileWriter.create(schema, AvroFile);

        // iterate over JSONs present in input file and write to Avro output file
        for (Iterator it = new ObjectMapper().readValues(
                new JsonFactory().createJsonParser(in), JSONObject.class); it.hasNext();) {

            JSONObject JsonRec = (JSONObject) it.next();
            sa.setId((CharSequence) JsonRec.get("id"));
            sa.setStudentId((Integer) JsonRec.get("student_id"));
            sa.setUniversityId((Integer) JsonRec.get("university_id"));

            LinkedHashMap CourseDetails = (LinkedHashMap) JsonRec.get("course_details");
            a.setCourseId((Integer) CourseDetails.get("course_id"));
            a.setEnrollDate((CharSequence) CourseDetails.get("enroll_date"));
            a.setVerb((CharSequence) CourseDetails.get("verb"));
            a.setResultScore((Double) CourseDetails.get("result_score"));

            sa.setCourseDetails(a);

            dataFileWriter.append(sa);
        }  // end of for loop

        in.close();
        dataFileWriter.close();

    } // end of serialize method

    public void deserialize () throws IOException {
        // create a schema
        Schema schema = new Schema.Parser().parse(new File("resources/StudentActivity.avsc"));
        // create a record using schema
        GenericRecord AvroRec = new GenericData.Record(schema);
        File AvroFile = new File("resources/StudentActivity.avro");
        DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>(schema);
        DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(AvroFile, datumReader);
        System.out.println("Deserialized data is :");
        while (dataFileReader.hasNext()) {
            AvroRec = dataFileReader.next(AvroRec);
            System.out.println(AvroRec);
        }
    }

    public static void main(String[] args) throws JsonParseException, JsonProcessingException, IOException {
        AvroExampleWithoutCodeGeneration AvroEx = new AvroExampleWithoutCodeGeneration();
        AvroEx.serialize();
        AvroEx.deserialize();
    }

}
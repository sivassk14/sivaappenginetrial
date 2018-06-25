package Avro;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;

public class Serialize {
    public static void main(String args[]) throws IOException {

        //Instantiating generated emp class
/*        Emp e1=new Emp();

        //Creating values according the schema
        e1.setName("omar");
        e1.setAge(21);
        e1.setSalary(30000);
        e1.setAddress("Hyderabad");
        e1.setId(001);

        Emp e2=new Emp();

        e2.setName("ram");
        e2.setAge(30);
        e2.setSalary(40000);
        e2.setAddress("Hyderabad");
        e2.setId(002);

        Emp e3=new Emp();

        e3.setName("robbin");
        e3.setAge(25);
        e3.setSalary(35000);
        e3.setAddress("Hyderabad");
        e3.setId(003);

        //Instantiate DatumWriter class
        DatumWriter<Emp> empDatumWriter = new SpecificDatumWriter<Emp>(Emp.class);
        DataFileWriter<Emp> empFileWriter = new DataFileWriter<Emp>(empDatumWriter);
        empFileWriter.create(e1.getSchema(), new File("/home/sivakumar/Documents/Work/tools/Avro/emp.avro"));

        empFileWriter.append(e1);
        empFileWriter.append(e2);
        empFileWriter.append(e3);

        empFileWriter.close();

        System.out.println("data successfully serialized");*/
    }
}
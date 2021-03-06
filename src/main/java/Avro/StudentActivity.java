/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class StudentActivity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1800205949799553790L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StudentActivity\",\"namespace\":\"com.rishav.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"student_id\",\"type\":\"int\"},{\"name\":\"university_id\",\"type\":\"int\"},{\"name\":\"course_details\",\"type\":{\"type\":\"record\",\"name\":\"Activity\",\"fields\":[{\"name\":\"course_id\",\"type\":\"int\"},{\"name\":\"enroll_date\",\"type\":\"string\"},{\"name\":\"verb\",\"type\":\"string\"},{\"name\":\"result_score\",\"type\":\"double\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<StudentActivity> ENCODER =
      new BinaryMessageEncoder<StudentActivity>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<StudentActivity> DECODER =
      new BinaryMessageDecoder<StudentActivity>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<StudentActivity> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<StudentActivity> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<StudentActivity>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this StudentActivity to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a StudentActivity from a ByteBuffer. */
  public static StudentActivity fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public CharSequence id;
  @Deprecated public int student_id;
  @Deprecated public int university_id;
  @Deprecated public Activity course_details;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StudentActivity() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param student_id The new value for student_id
   * @param university_id The new value for university_id
   * @param course_details The new value for course_details
   */
  public StudentActivity(CharSequence id, Integer student_id, Integer university_id, Activity course_details) {
    this.id = id;
    this.student_id = student_id;
    this.university_id = university_id;
    this.course_details = course_details;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return student_id;
    case 2: return university_id;
    case 3: return course_details;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: id = (CharSequence)value$; break;
    case 1: student_id = (Integer)value$; break;
    case 2: university_id = (Integer)value$; break;
    case 3: course_details = (Activity)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'student_id' field.
   * @return The value of the 'student_id' field.
   */
  public Integer getStudentId() {
    return student_id;
  }

  /**
   * Sets the value of the 'student_id' field.
   * @param value the value to set.
   */
  public void setStudentId(Integer value) {
    this.student_id = value;
  }

  /**
   * Gets the value of the 'university_id' field.
   * @return The value of the 'university_id' field.
   */
  public Integer getUniversityId() {
    return university_id;
  }

  /**
   * Sets the value of the 'university_id' field.
   * @param value the value to set.
   */
  public void setUniversityId(Integer value) {
    this.university_id = value;
  }

  /**
   * Gets the value of the 'course_details' field.
   * @return The value of the 'course_details' field.
   */
  public Activity getCourseDetails() {
    return course_details;
  }

  /**
   * Sets the value of the 'course_details' field.
   * @param value the value to set.
   */
  public void setCourseDetails(Activity value) {
    this.course_details = value;
  }

  /**
   * Creates a new StudentActivity RecordBuilder.
   * @return A new StudentActivity RecordBuilder
   */
  public static StudentActivity.Builder newBuilder() {
    return new StudentActivity.Builder();
  }

  /**
   * Creates a new StudentActivity RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StudentActivity RecordBuilder
   */
  public static StudentActivity.Builder newBuilder(StudentActivity.Builder other) {
    return new StudentActivity.Builder(other);
  }

  /**
   * Creates a new StudentActivity RecordBuilder by copying an existing StudentActivity instance.
   * @param other The existing instance to copy.
   * @return A new StudentActivity RecordBuilder
   */
  public static StudentActivity.Builder newBuilder(StudentActivity other) {
    return new StudentActivity.Builder(other);
  }

  /**
   * RecordBuilder for StudentActivity instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StudentActivity>
    implements org.apache.avro.data.RecordBuilder<StudentActivity> {

    private CharSequence id;
    private int student_id;
    private int university_id;
    private Activity course_details;
    private Activity.Builder course_detailsBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(StudentActivity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.student_id)) {
        this.student_id = data().deepCopy(fields()[1].schema(), other.student_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.university_id)) {
        this.university_id = data().deepCopy(fields()[2].schema(), other.university_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.course_details)) {
        this.course_details = data().deepCopy(fields()[3].schema(), other.course_details);
        fieldSetFlags()[3] = true;
      }
      if (other.hasCourseDetailsBuilder()) {
        this.course_detailsBuilder = Activity.newBuilder(other.getCourseDetailsBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing StudentActivity instance
     * @param other The existing instance to copy.
     */
    private Builder(StudentActivity other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.student_id)) {
        this.student_id = data().deepCopy(fields()[1].schema(), other.student_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.university_id)) {
        this.university_id = data().deepCopy(fields()[2].schema(), other.university_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.course_details)) {
        this.course_details = data().deepCopy(fields()[3].schema(), other.course_details);
        fieldSetFlags()[3] = true;
      }
      this.course_detailsBuilder = null;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public StudentActivity.Builder setId(CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public StudentActivity.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'student_id' field.
      * @return The value.
      */
    public Integer getStudentId() {
      return student_id;
    }

    /**
      * Sets the value of the 'student_id' field.
      * @param value The value of 'student_id'.
      * @return This builder.
      */
    public StudentActivity.Builder setStudentId(int value) {
      validate(fields()[1], value);
      this.student_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'student_id' field has been set.
      * @return True if the 'student_id' field has been set, false otherwise.
      */
    public boolean hasStudentId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'student_id' field.
      * @return This builder.
      */
    public StudentActivity.Builder clearStudentId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'university_id' field.
      * @return The value.
      */
    public Integer getUniversityId() {
      return university_id;
    }

    /**
      * Sets the value of the 'university_id' field.
      * @param value The value of 'university_id'.
      * @return This builder.
      */
    public StudentActivity.Builder setUniversityId(int value) {
      validate(fields()[2], value);
      this.university_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'university_id' field has been set.
      * @return True if the 'university_id' field has been set, false otherwise.
      */
    public boolean hasUniversityId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'university_id' field.
      * @return This builder.
      */
    public StudentActivity.Builder clearUniversityId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'course_details' field.
      * @return The value.
      */
    public Activity getCourseDetails() {
      return course_details;
    }

    /**
      * Sets the value of the 'course_details' field.
      * @param value The value of 'course_details'.
      * @return This builder.
      */
    public StudentActivity.Builder setCourseDetails(Activity value) {
      validate(fields()[3], value);
      this.course_detailsBuilder = null;
      this.course_details = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'course_details' field has been set.
      * @return True if the 'course_details' field has been set, false otherwise.
      */
    public boolean hasCourseDetails() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'course_details' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Activity.Builder getCourseDetailsBuilder() {
      if (course_detailsBuilder == null) {
        if (hasCourseDetails()) {
          setCourseDetailsBuilder(Activity.newBuilder(course_details));
        } else {
          setCourseDetailsBuilder(Activity.newBuilder());
        }
      }
      return course_detailsBuilder;
    }

    /**
     * Sets the Builder instance for the 'course_details' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public StudentActivity.Builder setCourseDetailsBuilder(Activity.Builder value) {
      clearCourseDetails();
      course_detailsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'course_details' field has an active Builder instance
     * @return True if the 'course_details' field has an active Builder instance
     */
    public boolean hasCourseDetailsBuilder() {
      return course_detailsBuilder != null;
    }

    /**
      * Clears the value of the 'course_details' field.
      * @return This builder.
      */
    public StudentActivity.Builder clearCourseDetails() {
      course_details = null;
      course_detailsBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public StudentActivity build() {
      try {
        StudentActivity record = new StudentActivity();
        record.id = fieldSetFlags()[0] ? this.id : (CharSequence) defaultValue(fields()[0]);
        record.student_id = fieldSetFlags()[1] ? this.student_id : (Integer) defaultValue(fields()[1]);
        record.university_id = fieldSetFlags()[2] ? this.university_id : (Integer) defaultValue(fields()[2]);
        if (course_detailsBuilder != null) {
          record.course_details = this.course_detailsBuilder.build();
        } else {
          record.course_details = fieldSetFlags()[3] ? this.course_details : (Activity) defaultValue(fields()[3]);
        }
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<StudentActivity>
    WRITER$ = (org.apache.avro.io.DatumWriter<StudentActivity>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<StudentActivity>
    READER$ = (org.apache.avro.io.DatumReader<StudentActivity>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

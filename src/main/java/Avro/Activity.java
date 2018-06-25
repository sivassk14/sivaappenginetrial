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
public class Activity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5353049568591197745L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Activity\",\"namespace\":\"com.rishav.avro\",\"fields\":[{\"name\":\"course_id\",\"type\":\"int\"},{\"name\":\"enroll_date\",\"type\":\"string\"},{\"name\":\"verb\",\"type\":\"string\"},{\"name\":\"result_score\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Activity> ENCODER =
      new BinaryMessageEncoder<Activity>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Activity> DECODER =
      new BinaryMessageDecoder<Activity>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Activity> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Activity> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Activity>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Activity to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Activity from a ByteBuffer. */
  public static Activity fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int course_id;
  @Deprecated public CharSequence enroll_date;
  @Deprecated public CharSequence verb;
  @Deprecated public double result_score;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Activity() {}

  /**
   * All-args constructor.
   * @param course_id The new value for course_id
   * @param enroll_date The new value for enroll_date
   * @param verb The new value for verb
   * @param result_score The new value for result_score
   */
  public Activity(Integer course_id, CharSequence enroll_date, CharSequence verb, Double result_score) {
    this.course_id = course_id;
    this.enroll_date = enroll_date;
    this.verb = verb;
    this.result_score = result_score;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return course_id;
    case 1: return enroll_date;
    case 2: return verb;
    case 3: return result_score;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: course_id = (Integer)value$; break;
    case 1: enroll_date = (CharSequence)value$; break;
    case 2: verb = (CharSequence)value$; break;
    case 3: result_score = (Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'course_id' field.
   * @return The value of the 'course_id' field.
   */
  public Integer getCourseId() {
    return course_id;
  }

  /**
   * Sets the value of the 'course_id' field.
   * @param value the value to set.
   */
  public void setCourseId(Integer value) {
    this.course_id = value;
  }

  /**
   * Gets the value of the 'enroll_date' field.
   * @return The value of the 'enroll_date' field.
   */
  public CharSequence getEnrollDate() {
    return enroll_date;
  }

  /**
   * Sets the value of the 'enroll_date' field.
   * @param value the value to set.
   */
  public void setEnrollDate(CharSequence value) {
    this.enroll_date = value;
  }

  /**
   * Gets the value of the 'verb' field.
   * @return The value of the 'verb' field.
   */
  public CharSequence getVerb() {
    return verb;
  }

  /**
   * Sets the value of the 'verb' field.
   * @param value the value to set.
   */
  public void setVerb(CharSequence value) {
    this.verb = value;
  }

  /**
   * Gets the value of the 'result_score' field.
   * @return The value of the 'result_score' field.
   */
  public Double getResultScore() {
    return result_score;
  }

  /**
   * Sets the value of the 'result_score' field.
   * @param value the value to set.
   */
  public void setResultScore(Double value) {
    this.result_score = value;
  }

  /**
   * Creates a new Activity RecordBuilder.
   * @return A new Activity RecordBuilder
   */
  public static Activity.Builder newBuilder() {
    return new Activity.Builder();
  }

  /**
   * Creates a new Activity RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Activity RecordBuilder
   */
  public static Activity.Builder newBuilder(Activity.Builder other) {
    return new Activity.Builder(other);
  }

  /**
   * Creates a new Activity RecordBuilder by copying an existing Activity instance.
   * @param other The existing instance to copy.
   * @return A new Activity RecordBuilder
   */
  public static Activity.Builder newBuilder(Activity other) {
    return new Activity.Builder(other);
  }

  /**
   * RecordBuilder for Activity instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Activity>
    implements org.apache.avro.data.RecordBuilder<Activity> {

    private int course_id;
    private CharSequence enroll_date;
    private CharSequence verb;
    private double result_score;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Activity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.course_id)) {
        this.course_id = data().deepCopy(fields()[0].schema(), other.course_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.enroll_date)) {
        this.enroll_date = data().deepCopy(fields()[1].schema(), other.enroll_date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.verb)) {
        this.verb = data().deepCopy(fields()[2].schema(), other.verb);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.result_score)) {
        this.result_score = data().deepCopy(fields()[3].schema(), other.result_score);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Activity instance
     * @param other The existing instance to copy.
     */
    private Builder(Activity other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.course_id)) {
        this.course_id = data().deepCopy(fields()[0].schema(), other.course_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.enroll_date)) {
        this.enroll_date = data().deepCopy(fields()[1].schema(), other.enroll_date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.verb)) {
        this.verb = data().deepCopy(fields()[2].schema(), other.verb);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.result_score)) {
        this.result_score = data().deepCopy(fields()[3].schema(), other.result_score);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'course_id' field.
      * @return The value.
      */
    public Integer getCourseId() {
      return course_id;
    }

    /**
      * Sets the value of the 'course_id' field.
      * @param value The value of 'course_id'.
      * @return This builder.
      */
    public Activity.Builder setCourseId(int value) {
      validate(fields()[0], value);
      this.course_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'course_id' field has been set.
      * @return True if the 'course_id' field has been set, false otherwise.
      */
    public boolean hasCourseId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'course_id' field.
      * @return This builder.
      */
    public Activity.Builder clearCourseId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'enroll_date' field.
      * @return The value.
      */
    public CharSequence getEnrollDate() {
      return enroll_date;
    }

    /**
      * Sets the value of the 'enroll_date' field.
      * @param value The value of 'enroll_date'.
      * @return This builder.
      */
    public Activity.Builder setEnrollDate(CharSequence value) {
      validate(fields()[1], value);
      this.enroll_date = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'enroll_date' field has been set.
      * @return True if the 'enroll_date' field has been set, false otherwise.
      */
    public boolean hasEnrollDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'enroll_date' field.
      * @return This builder.
      */
    public Activity.Builder clearEnrollDate() {
      enroll_date = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'verb' field.
      * @return The value.
      */
    public CharSequence getVerb() {
      return verb;
    }

    /**
      * Sets the value of the 'verb' field.
      * @param value The value of 'verb'.
      * @return This builder.
      */
    public Activity.Builder setVerb(CharSequence value) {
      validate(fields()[2], value);
      this.verb = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'verb' field has been set.
      * @return True if the 'verb' field has been set, false otherwise.
      */
    public boolean hasVerb() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'verb' field.
      * @return This builder.
      */
    public Activity.Builder clearVerb() {
      verb = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'result_score' field.
      * @return The value.
      */
    public Double getResultScore() {
      return result_score;
    }

    /**
      * Sets the value of the 'result_score' field.
      * @param value The value of 'result_score'.
      * @return This builder.
      */
    public Activity.Builder setResultScore(double value) {
      validate(fields()[3], value);
      this.result_score = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'result_score' field has been set.
      * @return True if the 'result_score' field has been set, false otherwise.
      */
    public boolean hasResultScore() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'result_score' field.
      * @return This builder.
      */
    public Activity.Builder clearResultScore() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Activity build() {
      try {
        Activity record = new Activity();
        record.course_id = fieldSetFlags()[0] ? this.course_id : (Integer) defaultValue(fields()[0]);
        record.enroll_date = fieldSetFlags()[1] ? this.enroll_date : (CharSequence) defaultValue(fields()[1]);
        record.verb = fieldSetFlags()[2] ? this.verb : (CharSequence) defaultValue(fields()[2]);
        record.result_score = fieldSetFlags()[3] ? this.result_score : (Double) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Activity>
    WRITER$ = (org.apache.avro.io.DatumWriter<Activity>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Activity>
    READER$ = (org.apache.avro.io.DatumReader<Activity>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

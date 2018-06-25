package Avro;


@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Emp {

    public CharSequence name;
    public int id;
    public int salary;
    public int age;
    public CharSequence address;

    public Emp(CharSequence name, int id, int salary, int age, CharSequence address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
        this.address = address;
    }

    public Emp(){

    }

    public CharSequence getName() {
        return name;
    }

    public void setName(CharSequence name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CharSequence getAddress() {
        return address;
    }

    public void setAddress(CharSequence address) {
        this.address = address;
    }
}

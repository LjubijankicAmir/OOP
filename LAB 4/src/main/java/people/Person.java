package people;

public class Person{
    protected String name;
    private int age;
    private String country;
    protected String address;

    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String toString(){
        return this.name + "\n  " + this.address;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
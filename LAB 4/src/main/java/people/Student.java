package people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private int credits;
    private int student_id;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String address) {
        super(name, address);
        this.credits=0;
    }

    public void study(){
        credits++;
    }

    public int credits(){
        return credits;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public void addGrade(Integer g){
        grades.add(g);
    }

    @Override
    public String toString(){
        return this.name + "\n  "
                + this.address + "\n  credits " + this.credits;
    }
}
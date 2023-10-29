package people;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printDepartment(List<Person> people) {
        for(Person p:people){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola",
                "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli",
                "Ida Albergintie Street 1 00400 Helsinki") );
        people.add( new Teacher("Esko Ukkonen",
                "Mannerheimintie 15 Street 00100 Helsinki", 5400));

        printDepartment(people);
    }

}
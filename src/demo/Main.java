package demo;


import java.util.ArrayList;
import java.util.List;

//Opgave udarbejdet med Alexander Stohn
public class Main {

    public static void main(String[] args) {

        //Employees
        List<Employee> employees = new ArrayList<>();
        Administration administration = new Administration("Claus", "221175-1011", 37, 23000, 5);
        Instructor instructor = new Instructor("Tove", "011080-1014", 20, 9120, 0);
        Administration administration2 = new Administration("Anna", "011080-1012", 37, 23000, 5);
        Instructor instructor2 = new Instructor("Henning", "011080-1014", 15, 6840, 0);
        employees.add(administration);
        employees.add(instructor);
        employees.add(administration2);
        employees.add(instructor2);


        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("===========================");

        //Members
        List<Member> members = new ArrayList<>();
        Member member = new Member("Morten", "130195-1303", true);
        Member member2 = new Member("Martin", "221175-1011", false);
        Member member3 = new Member("Martina", "050970-1409", true);
        Member member4 = new Member("Marcel", "221175-1011", false);
        members.add(member);
        members.add(member2);
        members.add(member3);
        members.add(member4);
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }

        System.out.println("===========================");


        //Persons
        List<Person> persons = new ArrayList<>();
        persons.add(administration);
        persons.add(administration2);
        persons.add(instructor);
        persons.add(instructor2);
        persons.add(member);
        persons.add(member2);
        persons.add(member3);
        persons.add(member4);
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Navn: " + persons.get(i).getName() + ", Cpr: " + persons.get(i).getCpr());
        }


    }
}

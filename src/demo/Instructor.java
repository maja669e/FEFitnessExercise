package demo;

public class Instructor extends Employee {


    public Instructor(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr, hours, salary, vacation);
    }

    @Override
    public int getSalary() {
        return getHours()*199;
    }


}

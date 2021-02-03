package demo;

public class Employee extends Person {

    private int hours;
    private int salary;
    private int vacation;

    public Employee(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
        this.vacation = vacation;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "name=" + name +
                ", cpr=" + cpr +
                ", hours='" + hours + '\'' +
                ", salary=" + salary +
                ", vacation=" + vacation +
                '}';
    }
}

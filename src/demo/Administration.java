package demo;

public class Administration extends Employee {

    private int vacation;

    public Administration(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    public int getVacation() {
        if(super.getHours() == 37){
            vacation = 5;
        }
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

}

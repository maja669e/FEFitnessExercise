package demo;

public class Member extends Person{

    private boolean isBasic;
    private int sum;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }


    public String getMemberType(){
        if (isBasic == false){
            return "basic";
        } else {
            return "full";
        }
    }

    public int monthlyFee(){
        if (isBasic == false){
            sum = 199;
            return sum;
        } else {
            sum = 299;
            return sum;
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", cpr=" + cpr +
                ", isBasic=" + isBasic +
                ", fee=" + monthlyFee() +
                '}';
    }
}

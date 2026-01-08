/*public final class Salesman -> final não permite que a classe seja extendida para outras*/

public final class Salesman extends Employee {
    public Salesman(String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);
    }

    @Override
    public String getCode(){
        return "SL" + super.getCode();
    }

    public Salesman() {}

    public double getPercentSold() {
        return percentSold;
    }

    public void setPercentSold(double percentSold) {
        this.percentSold = percentSold;
    }

    private double percentSold;
}

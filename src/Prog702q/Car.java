package Prog702q;

public class Car extends Vehicle {
    private double moneyWorth;
    public Car(String n,int t,double v) {
        super(n,t,v);
        moneyWorth = v;
    }

    public double getWorth() {return moneyWorth;}
}

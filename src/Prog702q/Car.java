package Prog702q;

public class Car extends Vehicle {
    private double worth;
    public Car(String name,int tire,double v) {
        super(name,tire,v);
        worth = v;
    }
    public double getWorth() {return worth;}

}

package Prog702q;

public class Car extends Vehicle {
    private double worth;
    public Car(int type,String name,int tire,double v) {
        super(type,name,tire,v);
        worth = v;
    }
    public double getWorth() {return worth;}

}

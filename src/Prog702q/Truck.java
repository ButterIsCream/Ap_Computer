package Prog702q;

public class Truck extends Vehicle {
    private double miles;

    public Truck(int type,String name,int tire,double v) {
        super(type,name,tire,v);
        miles = v;
    }
    public double getMiles() {return miles;}
}

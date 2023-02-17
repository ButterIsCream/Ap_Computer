package Prog702q;

public class Truck extends Vehicle {
    private double miles;

    public Truck(String name,int tire,double v) {
        super(name,tire,v);
        miles = v;
    }
    public double getMiles() {return miles;}
}

package Prog702q;

public class Vehicle implements Names {
    private int tires = 0;
    private String name;
    private double value;
    public Vehicle(String n,int t,double v) {
        tires = t;
        name = n;
        value = v;
    }
    public int getTire() {return tires;}
    public double getValue() {return value;}
    public String getName() {return name;}
}

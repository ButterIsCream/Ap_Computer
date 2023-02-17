package Prog702q;

public class Vehicle implements Names {
    private int tire;
    private double v;
    private String name;

    public Vehicle(String name,int tire,double v) {
        this.tire = tire;
        this.name = name;
        this.v = v;
    }

    public int getTire() {return tire;};
    public double getValue() {return v;}
    public String getName(){return name;}
}

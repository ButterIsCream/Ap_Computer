package Prog702q;

public class Vehicle implements Names {
    private int tire;
    private double v;
    private int type;
    private String name;

    public Vehicle(int type,String name,int tire,double v) {
        this.tire = tire;
        this.type = type;
        this.name = name;
        this.v = v;
    }

    public int getTire() {return tire;};
    public int getType() {return type;}
    public double getValue() {return v;}
    public String getName(){return name;}
}

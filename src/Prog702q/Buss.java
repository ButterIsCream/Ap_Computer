package Prog702q;

public class Buss extends Vehicle {
    private String city;
    public Buss(String n,int t,double v,String c) {
        super(n,t,v);
        city = c;
    }
    public String getCity() {return city;}
}

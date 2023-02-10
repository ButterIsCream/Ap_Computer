package Prog702q;

public class Buss extends Vehicle {
    private String city;
    public Buss(int type,String name,int tire,String v) {
        super(type,name,tire,0);
        city = v;
    }
    public String getCity() {return city;}

}

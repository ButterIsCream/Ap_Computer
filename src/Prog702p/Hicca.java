package Prog702p;

public class Hicca extends Animal {
    private double furWorth = 0;

    public Hicca(String n,String w,String t,double fur) {
        super(n,w,t);
        furWorth = fur;
    }

    public double getWorth() {return furWorth;}
}

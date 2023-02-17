package Prog702p;

public class Hicca extends Animal {
    private double furWorth = 0;

    public Hicca(String n,String w,double fur) {
        super(n,w);
        furWorth = fur;
    }

    public double getWorth() {return furWorth;}
}

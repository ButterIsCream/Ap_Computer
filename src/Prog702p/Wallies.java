package Prog702p;

public class Wallies extends Animal {
    private double steps = 0;

    public Wallies(String n,String w,String t,double stepsPerDay) {
        super(n,w,t);
        steps = stepsPerDay;
    }

    public double getDailySteps() {return steps;}
}

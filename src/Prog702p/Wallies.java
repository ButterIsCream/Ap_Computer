package Prog702p;

public class Wallies extends Animal {
    private double steps = 0;

    public Wallies(String n,String w,double stepsPerDay) {
        super(n,w);
        steps = stepsPerDay;
    }

    public double getDailySteps() {return steps;}
}

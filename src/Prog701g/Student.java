package Prog701g;

public class Student extends Person {
    private double myGPA;

    public Student(String f,String l,Double gpa) {
        super(f,l);
        myGPA = gpa;
    }

    public double getGPA() {return myGPA;}
}

package Prog702p;

public class Beepers extends Animal {
    private String specialWord = "";

    public Beepers(String n,String w,String sw) {
        super(n,w);
        specialWord = sw;
    }

    public String getSpecialWord() {return specialWord;}
}

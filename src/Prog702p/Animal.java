package Prog702p;

public class Animal implements Names {
    private String name = "";
    private String word = "";

    public Animal(String n,String w) {
        name = n;
        word = w;
    }

    public String getName() {return name;}
    public String getWord() {return word;}
}

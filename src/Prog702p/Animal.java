package Prog702p;

public class Animal implements Names {
    private String name = "";
    private String word = "";
    private String type = "";

    public Animal(String n,String w,String t) {
        name = n;
        word = w;
        type = t;
    }

    public String getName() {return name + " " + word;}
    public String getWord() {return word;}
    public String getType() {return type;}
}

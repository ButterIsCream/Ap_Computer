package Prog701g;

public class Admin extends Person {
    private String myFavw;

    public Admin(String f,String l,String fav) {
        super(f,l);
        myFavw = fav;
    }

    public String GetFavW() {return myFavw;}
}

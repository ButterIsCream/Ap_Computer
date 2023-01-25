package Prog702p;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));

        } catch(IOException e) {
            System.out.print(e);
        }
    }
}

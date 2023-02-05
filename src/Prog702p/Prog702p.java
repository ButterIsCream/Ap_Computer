package Prog702p;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog701g.dat"));

            ArrayList<Animal> info = new ArrayList<>();

            while(input.hasNext()) {
                int type = input.nextInt();

                if (type == 99) {
                    break;
                }

                String f = input.next();
                String l = input.next();

                if(type == 1) {
                    double in = input.nextDouble();
                    info.add(new Hicca(f,l,"Hicca",in));
                } else if(type == 2) {
                    double in = input.nextDouble();
                    info.add(new Wallies(f,l,"Wallie",in));
                } else if(type == 3) {
                    String in = input.next();
                    info.add(new Beepers(f,l,"Beeper",in));
                }
            }

            for(Animal anim : info) {
                String type = anim.getType();
                String name = anim.getName();
                System.out.println(type + " name is: " + name);

                if (type == "Beeper") {
                    System.out.println(type + " word is : " + ((Beepers)anim).getSpecialWord());
                } else if (type == "Wallie") {
                    System.out.println("Waillies steps taken : " + ((Wallies)anim).getDailySteps());
                } else {
                    System.out.println("It's fur is worth : " + ((Hicca)anim).getWorth());
                }

                System.out.println();
            }
        } catch(IOException e) {
            System.out.print(e);
        }
    }
}

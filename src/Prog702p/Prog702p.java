package Prog702p;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            List<Animal> animalsList = new ArrayList<>();

            int animalType = input.nextInt();

            while(animalType != 99) {
                String f = input.next();
                String l = input.next();
                String name = f + " " + l;
                double value = input.nextDouble();

                if(animalType == 1) {
                    Animal hicca = new Hicca(f,l,value);
                    animalsList.add(hicca);
                } else if(animalType == 2) {
                    Animal wallies = new Wallies(f,l,value);
                    animalsList.add(wallies);
                } else if (animalType == 3) {
                    Animal beepers = new Beepers(f,l,"X");
                    animalsList.add(beepers);
                }


                animalType = input.nextInt();
            }
        } catch(IOException e) {
            System.out.print(e);
        }
    }
}

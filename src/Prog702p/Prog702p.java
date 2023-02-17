package Prog702p;

import java.io.File;
import java.io.IOException;
import java.util.*;

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
                    info.add(new Hicca(f,l,in));
                } else if(type == 2) {
                    double in = input.nextDouble();
                    info.add(new Wallies(f,l,in));
                } else if(type == 3) {
                    String in = input.next();
                    info.add(new Beepers(f,l,in));
                }
            }

            for(Animal anim : info) {
                String name = anim.getName();
                System.out.println("name is: " + name);

                if (anim instanceof  Beepers) {
                    Beepers beep = ((Beepers)anim);
                    int largest = 0;
                    System.out.println("Beepers" + " word is : " + beep.getSpecialWord());
                    System.out.println("Key");
                } else if (anim instanceof Wallies) {
                    System.out.println("Waillies steps taken : " + ((Wallies)anim).getDailySteps());
                } else {
                    System.out.println("It's fur is worth : " + ((Hicca)anim).getWorth());
                }

                System.out.println();
            }

            String bl = "a";
            int occured = 0;

            for(Animal anim : info) {
                if(anim instanceof Beepers) {
                    String specialWord = ((Beepers) anim).getSpecialWord();

                    for(int i = 0; i < specialWord.length(); i++) {
                        String l = specialWord.substring(i,i +1);
                        int count = 0;

                        for(int i2 = 0; i2 < specialWord.length(); i2++) {
                            if(i2 != i) {
                                String l2 =specialWord.substring(i2,i2 + 1);

                                if(l2.matches(l)) {
                                    count++;
                                }
                            }
                        }

                        if(count > occured) {
                            occured = count;
                            bl = l;
                        }
                    }
                }
            }

            System.out.println("Beepers favorite word is : " + bl);
        } catch(IOException e) {
            System.out.print(e);
        }
    }
}

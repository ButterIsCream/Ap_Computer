package Prog702p;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog702p {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog701g.dat"));

            ArrayList<Animal> info = new ArrayList<>();
            Dictionary<String,Integer> data = new Hashtable<>();

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
                    int largest = 0;
                    String letter = "";
                    System.out.println(type + " word is : " + ((Beepers)anim).getSpecialWord());

                    for(int i = 0; i < name.length(); i++) {
                        int end = Math.min(i + 1,name.length() - 1);
                        String l = name.substring(i,end);

                        if(data.get(l) == -1) {
                            data.put(l, 0);
                        } else {
                            data.put(l,data.get(l) + 1);
                        }
                    }

                    for(String key : data.keys()) {
                        if(data.get(key) > largest) {
                            largest = data.get(key);
                            letter = key;
                        }
                    }

                    System.out.println("Key");
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

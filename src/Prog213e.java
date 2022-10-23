/*
Note to teacher :

I was just messing with dictonarys and what not.
Ik this is a bit overkill, but I'm mostly just tryna learn the basics.
So I'm sorry if my code hurts to look at.
 */

import java.util.*;
import java.io.*;

public class Prog213e {

    public static void main(String[] args) {
        int amountinfamily = 0;
        Dictionary<Integer,ArrayList<Integer>> data = new Hashtable<Integer,ArrayList<Integer>>();

        data.put(20,new ArrayList<Integer>());
        data.put(39,new ArrayList<Integer>());
        data.put(59,new ArrayList<Integer>());
        data.put(79,new ArrayList<Integer>());
        data.put(100,new ArrayList<Integer>());

        try {
            Scanner input = new Scanner(new File("./src/data/prog213e.dat"));

            while(input.hasNext()) {
                int num = input.nextInt();
                
                if (num < 20) {
                    data.get(20).add(num);
                } else if (num <= 39) {
                    data.get(39).add(num);
                } else if (num <= 59) {
                    data.get(59).add(num);
                } else if (num <= 79) {
                    data.get(79).add(num);
                } else {
                    data.get(100).add(num);
                }

                amountinfamily = amountinfamily + 1;
            }


            Enumeration<Integer> keys = data.keys();

            while(keys.hasMoreElements()) {
                int key = keys.nextElement();
                ArrayList<Integer> value = data.get(key);

                double per = (double)value.size() / amountinfamily * 100;

                System.out.println(key + "\t" + value.size() + "\t" + per);
            }
        } catch(IOException e) {
            System.out.println("Look harder");
        }

    }
}

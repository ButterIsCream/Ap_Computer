package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog464a.dat"));
            ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

            while(input.hasNext()) {
                ArrayList<Integer> data = new ArrayList<>();

                for(int i = 0; i < 5; i++) {
                    data.add(input.nextInt());
                }

                numbers.add(data);
            }

            for(ArrayList<Integer> nums : numbers) {
                for(int num : nums) {
                    System.out.printf("%s\t",num);
                }
                System.out.println();
            }

            for(int i = 0; i < numbers.size(); i++) {
                int sum = 0;

                for(int i2 = 0; i2 < numbers.size();i2++) {
                    ArrayList<Integer> nums = numbers.get(i2);
                    sum+= nums.get(i);
                }

                System.out.printf("%s\t",sum);
            }

        } catch(IOException e) {

        }
    }
}

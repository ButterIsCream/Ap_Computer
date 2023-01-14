import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog465b.dat"));
            ArrayList<ArrayList<Integer>> array = new ArrayList<>();
            ArrayList<Integer> under100 = new ArrayList<>();

            while(input.hasNext()) {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int num3 = input.nextInt();
                int num4 = input.nextInt();

                ArrayList<Integer> data = new ArrayList<>();
                List<Integer> nums = Arrays.asList(num1,num2,num3,num4);
                data.addAll(nums);
                array.add(data);
            }

            System.out.println("Orignal numbers :\n ");

            for(int i = 0; i < array.size(); i++) {
                ArrayList<Integer> numbers = array.get(i);

                for(int i2 = 0; i2 < numbers.size(); i2++) {
                    int number = numbers.get(i2);
                    System.out.printf("%s\t",number);
                    if (number < 100) {
                        under100.add(i2 + 1);
                    }
                }

                System.out.println();
            }

            System.out.println("\nNumbers less then 100\n\nRow\tColumn");


            for(int i = 0; i < under100.size(); i++) {
                System.out.println(i + 1 + "\t" + under100.get(i));
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

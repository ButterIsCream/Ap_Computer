import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog464a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner((new File("./src/data/prog464a.dat")));

            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

            while(input.hasNext()) {
                ArrayList<Integer> nums = new ArrayList<>();

                for(int i = 0; i < 5; i++) {
                    nums.add(input.nextInt());
                }

                matrix.add(nums);
            }

            for(int i = 0; i < matrix.size();i++) {
                int biggest = -1000;
                ArrayList<Integer> nums = matrix.get(i);

                for(int i2 = 0; i2 < nums.size(); i2++) {
                    int num = nums.get(i2);

                    if (num > biggest) {
                        biggest = num;
                    }
                }

                nums.add(biggest);
            }

            System.out.println("Matrix");

            for(ArrayList<Integer> numbers : matrix) {
                for(int num : numbers) {
                    System.out.printf("%s\t",num);
                }

                System.out.println();
            }
        } catch(IOException e) {

        }
    }
}

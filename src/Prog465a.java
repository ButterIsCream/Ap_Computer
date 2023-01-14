import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prog465a {

    public static ArrayList<ArrayList<Integer>> sortGreatest(ArrayList<ArrayList<Integer>> array) {
        int greatest = 0;
        int index = 0;
        ArrayList<ArrayList<Integer>> sortedArray = new ArrayList<>();

        while(array.size() != 0) {
            for (int i = 0; i < array.size(); i++) {
                ArrayList<Integer> data = array.get(i);
                int sum = 0;

                for (int i2 = 0; i2 < data.size(); i2++) {
                    int num = data.get(i2);
                    sum+=num;
                }

                if (sum > greatest) {
                    index = i;
                    greatest = sum;
                }
            }

            sortedArray.add(array.get(index));
            array.remove(index);
            index = 0;
            greatest = 0;
        }

        return sortedArray;
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog465a.dat"));
            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();


            while (input.hasNext()) {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int num3 = input.nextInt();
                int num4 = input.nextInt();

                List<Integer> list = Arrays.asList(num1, num2, num3, num4);
                ArrayList<Integer> data = new ArrayList<>();

                data.addAll(list);
                matrix.add(data);
            }

            System.out.println("Matrix 1");

            for(int i = 0;i < 4; i++) {
                for(int num : matrix.get(i)) {
                    System.out.printf("%s\t",num);
                }
                System.out.println();
            }

            System.out.println("Matrix 2");


            for(int i = 4;i < 8; i++) {
                for(int num : matrix.get(i)) {
                    System.out.printf("%s\t",num);
                }
                System.out.println();
            }

            ArrayList<ArrayList<Integer>> greatest = sortGreatest(matrix);

            System.out.println("Largest Elements");

            for(int i = 0; i < greatest.size(); i++) {
                ArrayList<Integer> ints = greatest.get(i);

                for(int num : ints) {
                    System.out.printf("%s\t",num);
                }

                System.out.println();
            }

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

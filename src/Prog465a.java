import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog465a {
    private static ArrayList<ArrayList<Integer>> sortGreatest(ArrayList<ArrayList<Integer>> array) {
        ArrayList<ArrayList<Integer>> sorted = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            int biggest = 0;
            ArrayList<Integer> arrayToAdd = new ArrayList<>();

            for(ArrayList<Integer> matrix : array) {
                int sum = 0;

                if (!sorted.contains(array)) {
                    for (int num : matrix) {
                        sum += num;
                    }
                }

                if(sum > biggest) {
                    biggest = sum;
                    arrayToAdd = matrix;
                }
            }

            sorted.add(arrayToAdd);
        }

        return sorted;
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog465a.dat"));
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            ArrayList<ArrayList<Integer>> greatest = new ArrayList<>();
            list.add(new ArrayList<Integer>());

            while(input.hasNext()) {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int num3 = input.nextInt();
                int num4 = input.nextInt();

                ArrayList<Integer> currentList = list.get(list.size() - 1);

                if(currentList.size() == 4) {
                    list.add(new ArrayList<Integer>());
                }

                currentList = list.get(list.size() - 1);

                currentList.add(num1);
                currentList.add(num2);
                currentList.add(num3);
                currentList.add(num4);
            }


            greatest = sortGreatest(list);

            System.out.println(greatest);

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

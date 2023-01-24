import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog465c.dat"));
            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

            while(input.hasNext()) {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int num3 = input.nextInt();
                int num4 = input.nextInt();


                ArrayList<Integer> data = new ArrayList<>();
                List<Integer> list = Arrays.asList(num1,num2,num3,num4);
                data.addAll(list);
                matrix.add(data);
            }

            System.out.println("Orignal Table :");

            int edges = 0;

            for(int i = 0; i < matrix.size();i++) {
                ArrayList<Integer> numbers = matrix.get(i);
                edges+= numbers.get(0) + numbers.get(3);
                for(int num : numbers) {
                    System.out.printf("%s\t",num);

                }

                System.out.println();
            }

            System.out.println("The total of the edges is : " + edges);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog477a.dat"));
            ArrayList<ArrayList<Integer>> nums = new ArrayList<>();

            while(input.hasNext()) {
                nums.add(new ArrayList<Integer>());

                nums.get(nums.size() - 1).add(input.nextInt());
            }

            for(ArrayList<Integer> info : nums) {
                int colum = info.get(0);
                int index = info.get(1);
                int value = info.get(2);

                System.out.printf("%s\t%s\t%s\n",colum,index,value);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

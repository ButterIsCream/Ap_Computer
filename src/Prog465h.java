import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog465h.dat"));
            ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
            ArrayList<ArrayList<Integer>> newSet = new ArrayList<>();

            while(input.hasNext()) {
                int n1 = input.nextInt();
                int n2 = input.nextInt();

                nums.add(new ArrayList<Integer>());

                for(int i = 0; i < 5;i++) {
                    int number = input.nextInt();
                    nums.get(nums.size() - 1).add(number);
                }
            }

            for(int i = 0; i < nums.size(); i++) {
                int index = 0;
                ArrayList<Integer> array = nums.get(i);

                for(int num : array) {
                    if(num != 0) {
                        ArrayList<Integer> info = new ArrayList<>();
                        info.add(i);
                        info.add(index);
                        info.add(num);
                        newSet.add(info;
                    }
                    index++;
                }
            }

            for(ArrayList<Integer> info : newSet) {
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

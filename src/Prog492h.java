import java.util.*;
import java.io.*;

public class Prog492h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog492h.dat"));

            int[][] cells = new int[32][32];
            int index = 0;

            while(input.hasNext()) {
                String l = input.next();

                for(int i = 0; i < l.length(); i++) {
                    int end;



                    if(i == l.length() - 1) {
                        end = i;
                    } else {
                        end = i +1;
                    }

                    String subbed = l.substring(i,end);

                    if(subbed.equals("*")) {
                        cells[index][i] = 1;
                    } else {
                        cells[index][i] = 0;
                    }
                }

                index++;
            }

            for(int r = 0; r < cells.length; r++) {
                for(int c = 0; c < cells[r].length; c++) {

                }
                System.out.println();
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

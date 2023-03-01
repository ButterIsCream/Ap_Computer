import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog477a.dat"));
            int[][] students = new int[33][2];
            int i = 0;

            while(input.hasNext()) {
                students[i][0] = input.nextInt();
                students[i][1] = input.nextInt();
                i++;
            }

            for(int r0 = 0; r0 < 5; r0++) {

                int g = r0 + 1;
                int m = 0;
                int f = 0;

                for(int r = 0; r < students.length; r++) {
                    int[] student = students[r];
                    int gender = student[0];
                    int grade = student[1];

                    if(grade == g) {
                        if(gender == 1) {
                            m++;
                        } else {
                            f++;
                        }
                    }
                }

                System.out.println(g + "\t" + m + "\t" + f + "\t" + (f + m));
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

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

            System.out.println("G\tM\tF\tTotal\n-------------------");

            int tm = 0;
            int tf = 0;

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
                            tm++;
                        } else {
                            f++;
                            tf++;
                        }
                    }
                }

                char letterGrade = (char)(64 + g);
                if(letterGrade == 69) letterGrade = 'F';

                System.out.println(letterGrade + "\t" + m + "\t" + f + "\t" + (f + m));

            }
            System.out.println("-------------------");
            System.out.println("T : " + tm + "\t" + tf + "\t" + (tm + tf));
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

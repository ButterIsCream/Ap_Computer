import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog477a.dat"));

            int females = 0;
            int males = 0;
            int total = 0;
            ArrayList<ArrayList<Integer>> info = new ArrayList<>();
            String[] letters = {"A","B","C","D","F"};

            for(int i = 0; i < 5; i++) {
                info.add(new ArrayList<>());
            }

            while(input.hasNext()) {
                int gender = input.nextInt();
                int grade = input.nextInt();

                ArrayList<Integer> data = info.get(grade - 1);
                data.add(gender);
                data.add(grade);
            }

            System.out.println("Grade\tMale\tFemale\tTotal");

            for(int i = 0; i < info.size(); i++) {
                int gradefemales = 0;
                int grademales = 0;
                int gradetotal = 0;
                int grade = 0;


                ArrayList<Integer> studentData = info.get(i);

                for(int i2 = 0; i2 < studentData.size(); i2+=2 ) {
                    int gender = studentData.get(i2);
                    grade = studentData.get(i2 + 1);

                    if(gender == 1) {
                        grademales++;
                    } else {
                        gradefemales++;
                    }
                }

                gradetotal = gradefemales + grademales;
                total += gradetotal;
                males += grademales;
                females += gradefemales;

                System.out.printf("%s\t\t%s\t\t%s\t\t%s\n",letters[grade - 1],grademales,gradefemales,gradetotal);
            }

            System.out.printf("Totals\t%s\t\t%s\t\t%s",males,females,total);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

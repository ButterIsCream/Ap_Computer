import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/survey.dat"));

            double average = 0;
            double averageProverty = 0;
            double housesBelow = 0;
            double housesAbove = 0;
            ArrayList<ArrayList<Integer>> houses = new ArrayList<>();
            ArrayList<ArrayList<Integer>> aboveAverage = new ArrayList<>();

            System.out.println("ID\tINCOME\tMEMBERS");

            while(input.hasNext()) {
                houses.add(new ArrayList<Integer>());

                int currentArray = houses.size() - 1;
                int id = input.nextInt();
                int income = input.nextInt();
                int members = input.nextInt();
                double provertyLevel = 3750 + 750 * (members - 2);

                List<Integer> data = Arrays.asList(id,income,members,(int)provertyLevel);
                houses.get(currentArray).addAll(data);
                averageProverty+=provertyLevel;
                average+=income;

                System.out.printf("\n\n%s\t%s\t%s\n",id,income,members);
            }

            averageProverty /= houses.size();
            average /= houses.size();

            System.out.println("Households with income exeeding an average income of " + average + "\nID\tINCOME\tMEMBERS");

            for(ArrayList<Integer> house : houses) {
                int id = house.get(0);
                int income = house.get(1);
                int members = house.get(2);
                int provertyLevel = house.get(3);

                if (provertyLevel < averageProverty) {
                    housesBelow++;
                }

                if (income > average) {
                    housesAbove++;
                    System.out.printf("%s\t%s\t%s\t\n",id,income,members);
                }
            }

            System.out.println("Percent of households beloew proverty level : " + (housesAbove / housesBelow));






        } catch(IOException e) {
            System.out.print(e);
        }
    }
}

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Proc214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog214b.dat"));

            while(input.hasNext()) {
                int employeeId = input.nextInt();
                double yearToDate = input.nextDouble();
                double rate = input.nextDouble();
                double shift = input.nextDouble();
                double hours = input.nextDouble();
                double grossPay = rate * hours;
                double sst = 0;
                double taxRate = 0;
                double netPay = 0;

                if (grossPay >= 100 && grossPay <= 149.99) {
                    taxRate = 0.08;
                } else if (grossPay >= 150 && grossPay <= 199) {
                    taxRate = 0.12;
                } else if (grossPay >= 200) {
                    taxRate = 0.15;
                } else if (grossPay >= 300) {
                    taxRate = 0.175;
                }

                if (yearToDate <= 17300 || yearToDate + grossPay <= 17300) {
                    sst = grossPay * 0.065;
                }

                sst = grossPay * sst;
                taxRate = grossPay * taxRate;
                netPay = (grossPay - sst - taxRate);

                System.out.printf("Employee number %s \n Hours %s   Rate %s   Shift %s\n\tCurrent\t\tYear-to-date\nGross Pay %.2f\t%.2f\nWithholding %s\nFICA %s\nNet Pay %s\n\n",employeeId,hours,rate,shift,grossPay,yearToDate,taxRate,sst,netPay);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

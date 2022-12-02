import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog214b.dat"));

            while(input.hasNext()) {
                int employeID = input.nextInt();
                double yearToDate = input.nextDouble();
                double rate = input.nextDouble();
                double shiftFactor = input.nextDouble();
                double hours = input.nextDouble();

                double grossPay = rate * hours;
                double withholding,fica,netPay,taxRate;

                taxRate = 0;

                if (grossPay < 100) {
                    taxRate = 0;
                } else if (grossPay <= 149.99) {
                    taxRate = 0.08;
                } else if (grossPay <= 199) {
                    taxRate = 0.12;
                } else if (grossPay <= 299.99) {
                    taxRate = 0.15;
                }

                if (yearToDate + grossPay <= 17300) {
                    fica = grossPay * 0.065;
                } else {
                    fica = Math.abs(17300 + (yearToDate + grossPay)) * 0.065;
                }

                withholding = grossPay * taxRate;
                netPay = grossPay - withholding - fica;

                System.out.printf("Employee number %s\nHours &s\tRate %s\t Shift Factor %s\n\tCurrent\tYear-to date\nGross Pay\t%s\t%s\nWithholding %s\nFICA %s\nNet Pay %s\n\n",employeID,hours,rate,shiftFactor,grossPay,yearToDate,withholding,fica,netPay);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

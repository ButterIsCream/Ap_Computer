import java.util.Scanner;

public class Prog54a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the model of the car: ");

        String model = input.nextLine();


        System.out.print("\n" + "How many miles were driven: ");

        double miles = input.nextDouble();

        System.out.print("\n" + "How many gallons were used: ");

        double gallons = input.nextDouble();
        double mpg = miles/gallons;

        System.out.print("\n" + "The average MPG used by the " + model + " are " + mpg + " m/g");
    }
}

/*
What is the model of the car: Bug

How many miles were driven: 120

How many gallons were used: 10

The average MPG used by the Bug are 12.0 m/g
 */
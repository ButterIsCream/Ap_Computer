package AbstClLab;

import java.io.IOException;
import java.util.Scanner;

public class AbstClLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //circle
        System.out.print("Enter circle radius : ");
        double radius = input.nextDouble();
        Shape sh1 = new Circle(radius);
        // Rectangle
        System.out.println("Enter height : ");
        double rheight = input.nextDouble();
        System.out.print("enter width : ");
        double rwidth = input.nextDouble();

        Shape sh2 = new Rectangle(rheight,rwidth);
        System.out.print("Enter triangle base : ");
        double tbase = input.nextDouble();
        System.out.println("Enter triangle height : ");
        double theight = input.nextDouble();
        Shape sh3 = new Triangle(theight,tbase);


        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calcCircumfrence();

        ((Rectangle)sh2).printClass();
        sh2.calculateArea();
        sh2.calcCircumfrence();

        ((Triangle)sh3).printClass();
        sh3.calculateArea();
        sh3.calcCircumfrence();
    }
}

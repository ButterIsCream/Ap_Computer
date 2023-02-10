package Prog703s;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog703s.txt"));

            ArrayList<Computer> computers = new ArrayList<>();

            while(input.hasNext()) {
                int type = input.nextInt();
                String name = input.next();
                int number = input.nextInt();
                double value = input.nextDouble();

                if(type == 3) {
                    int code = input.nextInt();
                    computers.add(new Linux(name,number,value,type,code));
                } else if(type == 2) {
                    double versionNum = input.nextDouble();
                    computers.add(new Windows(name,number,value,type,versionNum));
                } else {
                    String color = input.next();
                    computers.add(new Apple(name,number,value,type,color));
                }
            }

            for(Computer computer : computers) {
                int type = computer.getType();

                System.out.println("Name : " + computer.getName());
                System.out.println("Number : " + computer.getName());
                System.out.println("Value : " + computer.getValue());

                if(type == 1) {
                    System.out.println("Color : " + ((Apple)computer).getColor());
                } else if(type == 2) {
                    System.out.println("Version : " + ((Windows)computer).getVersion());
                } else {
                    System.out.println("Code : " + ((Linux)computer).getCode());
                }
            }
        } catch(IOException e) {

        }
    }
}

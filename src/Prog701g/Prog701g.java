package Prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog701g {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            List<Person> list = new ArrayList<Person>();

            int num = input.nextInt();

            while(num != 99) {
                String f = input.next();
                String l = input.next();

                if(num == 1) {
                    Double g= input.nextDouble();
                    Person person = new Student(f,l,g);
                    list.add(person);
                } else if(num == 2) {
                    int n = input.nextInt();
                    Person person = new Teacher(f,l,n);
                    list.add(person);
                } else if(num == 3) {
                    String favW = input.next();
                    Person person = new Admin(f,l,favW);
                    list.add(person);
                }

                num = input.nextInt();
            }

            double tot = 0;
            int count = 0;
            int totalStud = 0;
            String sm = "";
            String large = "laksjdlakjdlaksjdlkasjdlksajdlkajdalkjdoqijwdoiqjwdoqwijdqoiwjdqowdijqodijaosidjizjdoijzsdoijsdzojdzoijdzosijdozisjdzoisjdzoidjzosdjzoidjzidjzosijdoidjwoiajsodij";

            for(Person x : list) {
                if (x instanceof Student) {
                    tot += ((Student)x).getGPA();
                }

                if(x instanceof Teacher) {
                    tot += ((Teacher)x).intNumStudents();
                }

                if(x instanceof Admin) {
                    String xString = ((Admin)x).GetFavW();

                    if(xString.length() > large.length()) {
                        large = xString;
                    }

                    if(xString.length() < sm.length()) {
                        sm = xString;
                    }
                }
            }

            System.out.println("Average GPA : " + String.format("%.2f",(tot/count)));
        } catch(IOException e) {

        }
    }
}

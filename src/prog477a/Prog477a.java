package prog477a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog477a.Prog477a.dat"));
            ArrayList<Student> students = new ArrayList<>();

            while(input.hasNext()) {
                int grade = input.nextInt();
                int gender = input.nextInt();

                students.add(new Student(gender,grade));
            }


            for(Student student : students) {
                int grade = student.getGrade();
                int gender = student.getGender();


            }
        } catch(IOException e) {

        }
    }
}

package prog477a;

public class Student {
    private int gender = 0;
    private int grade = 0;

    public Student(int gr,int ge) {
        gender = ge;
        grade = gr;
    }

    public int getGender() {return gender;}
    public int getGrade() {return grade;}
}

public class Prog76aClass {
    private int dislikedNum;
    private int result;
    private int repeat;


    private void calc() {
        result = dislikedNum * 9;
        repeat = result * 12345679;
        print();
    }
    public Prog76aClass(int disliked) {
        if (disliked > 0 && disliked < 10) {
            dislikedNum = disliked;
            calc();
        } else {
            System.out.println("Put a number between 1-9.");
        }
    }

    public void print() {
        System.out.printf("%s\nX 9\n__________\n%s\nX 12345679\n__________\n%s",dislikedNum,result,repeat);
    }
}

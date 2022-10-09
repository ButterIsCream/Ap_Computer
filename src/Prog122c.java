public class Prog122c {
    public static void main(String[] args) {
        for(int i = 2; i <= 10; i+=2) {
            int t2 = i * 2;
            int p2 = (int)Math.pow(i,2);
            int pl1 = i + 1;

            System.out.printf("%s\t%s\t%s\t%s\n",i,pl1,t2,p2);
        }
    }
}

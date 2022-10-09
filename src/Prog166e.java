public class Prog166e {
    public static void main(String[] args) {
        for (int i = 2; i <= 15; i++) {
            for (int i2 = 1;i2 != i;i2++) {
                System.out.printf("%s/%s\t%.5f\n",i2,i,(double)i2/i);
            }
        }
    }
}

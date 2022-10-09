public class Prog122d {
    public static void main(String[] args) {
        System.out.println("x\ty");

        for (int i = -12; i <= 16; i++) {
            int total = (int)((Math.pow(i,6)) - (3 * (Math.pow(i,5))) - (93 * Math.pow(i,4)) + (87 * Math.pow(i,3)) + (1596 * Math.pow(i,2)) - (1380 * i) - 2800);

            System.out.println(i + "\t" + total);
        }
    }
}

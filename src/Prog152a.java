public class Prog152a {
    public static int getSum(int sum) {
        if(sum + 3 < 9669) {
            getSum(sum + 3);
        } else {
            return sum + 3;
        }

        return getSum(sum + 3);
    }

    public static void main(String[] args) {
        int sum = getSum(3);

        System.out.println(sum);
    }
}

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464d {
    public static int[][] transpose(int[][] mat) {
        int[][] transposed = new int[mat[0].length][mat.length];

        for(int r = 0; r < mat.length; r++) {
            for(int c = 0; c < mat[0].length; c++) {
                transposed[c][r] = mat[r][c];
            }
        }

        return transposed;
    }



    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("./src/data/prog464b.dat"));

            int[][] mat = new int[5][5];

            for(int r = 0; r < mat.length; r++) {
                for(int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }

            int[][] transposed = transpose(mat);

            System.out.println("Orignal Matrix : ");

            for(int[] r : mat) {
                for(int c : r) {
                    System.out.print(c + "");
                }
                System.out.println();
            }

            System.out.println("Transposed Matrix : ");

            for(int[] r : transposed) {
                for(int c : r) {
                    System.out.print(c + "");
                }
                System.out.println();
            }
;        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

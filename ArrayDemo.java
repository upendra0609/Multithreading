import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st size: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[][][] ar = new int[x][y][z];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    ar[i][j][k] = sc.nextInt();
                }
            }
        }

//        for (int[][] a : ar) {
//            for (int[] b : a) {
//                for (int c : b) {
//                    System.out.print(c + "  ");
//                }
//            }
//            System.out.println();
//        }


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(ar[i][j][k] + " ");
                }
            }

            System.out.println();
        }

    }

    public static void arr() {
        int[][][] ar = new int[2][][];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter size: ");
            int y = sc.nextInt();
            ar[i] = new int[y][];
            for (int j = 0; j < y; j++) {
                System.out.println("Enter size: ");
                int z = sc.nextInt();
                ar[i][j] = new int[z];
            }
        }

        for (int [][] a: ar){

        }
        System.out.println(ar[0].length);

    }
}

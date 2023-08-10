import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first size: ");
        int x = sc.nextInt();
        int[][][] ar = new int[x][][];


        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter second size: ");
            int y = sc.nextInt();
            ar[i] = new int[y][];
            for (int j = 0; j < ar[i].length; j++) {
                System.out.println("Enter third size: ");
                int z = sc.nextInt();
                ar[i][j] = new int[z];
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                for (int k = 0; k < ar[i][j].length; k++) {
                    System.out.println("Enter data: ");
                    ar[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int[][] i : ar) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}

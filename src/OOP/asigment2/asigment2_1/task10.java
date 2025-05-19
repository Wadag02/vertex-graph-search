package OOP.asigment2.asigment2_1;

import java.util.Scanner;

public class task10 {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            int rowSize = scanner.nextInt();
            multiArray[i] = new int[rowSize];
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}

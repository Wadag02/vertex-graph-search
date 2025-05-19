package OOP.asigment2.asigment2_1;

import java.util.Scanner;

public class task14 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[] rowSums = new int[3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rowSums[i] += array[i][j];
            }
        }
        int[] columnSums = new int[3];
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                columnSums[j] += array[i][j];
            }
        }
        int minSum = rowSums[0];
        for (int sum : rowSums) {
            if (sum < minSum) {
                minSum = sum;
            }
        }
        for (int sum : columnSums) {
            if (sum < minSum) {
                minSum = sum;
            }
        }
        System.out.println(minSum);
    }
}

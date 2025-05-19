package OOP.asigment2.asigment2_1;

import java.util.Scanner;

public class task16 {
    public static char[][] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = height * 2 - 1;
        array = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int left = height - 1 - i;
                int right = height - 1 + i;
                if (j >= left && j <= right) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}


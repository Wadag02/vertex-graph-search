package OOP.asigment2.asigment2_1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0) {
            int[] numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextInt();
            }
            if (N % 2 == 0) {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }
            } else {
                for (int i = 0; i < N; i++) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}

package OOP.asigment1.asigment1_2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите температуру:");
        int temp = scan.nextInt();
        if (temp < 0)
            System.out.println("it’s cold outside");
        else
            System.out.println("it’s warm outside");

    }
}

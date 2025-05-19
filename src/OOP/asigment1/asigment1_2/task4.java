package OOP.asigment1.asigment1_2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 20 || age > 60) {
            System.out.println("You don’t have to work");
        }
    }
}
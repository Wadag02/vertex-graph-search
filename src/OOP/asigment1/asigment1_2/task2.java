package OOP.asigment1.asigment1_2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scan.nextLine();
        System.out.print("Введите ваш возраст: ");
        int age = scan.nextInt();
        if (age > 17 && age < 29) {
            System.out.println(name + ", come to the military registration and enlistment office");
        }
    }
}

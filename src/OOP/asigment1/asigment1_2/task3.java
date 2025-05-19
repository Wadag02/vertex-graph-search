package OOP.asigment1.asigment1_2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp = scan.nextDouble();
        boolean high = temp > 37;
        boolean low = temp < 36;
        if (high) System.out.println("High temperature");
        else if (low) System.out.println("Low temperature");
        else System.out.println("Norm temperature");
    }
}

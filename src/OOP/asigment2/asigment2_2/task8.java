package OOP.asigment2.asigment2_2;

public class task8 {
    public static void main(String[] args) {
        System.out.println(cube(3));
        System.out.println(cube(-2));
        System.out.println(cube(1000));
    }
    public static long cube(long number) {
        return number * number * number;
    }
}

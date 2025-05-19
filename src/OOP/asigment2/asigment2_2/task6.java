package OOP.asigment2.asigment2_2;

public class task6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod(42);
        universalMethod("Hello, World!");
        universalMethod(3.14);
        universalMethod(true);
        universalMethod(42, "Answer to everything");
        universalMethod(new int[]{1, 2, 3});
        universalMethod("Java", "Programming");
        universalMethod('A');
        universalMethod(5L);
    }
    public static void universalMethod() {
        System.out.println("No parameters.");
    }
    public static void universalMethod(int a) {
        System.out.println("Integer parameter: " + a);
    }
    public static void universalMethod(String s) {
        System.out.println("String parameter: " + s);
    }
    public static void universalMethod(double d) {
        System.out.println("Double parameter: " + d);
    }
    public static void universalMethod(boolean b) {
        System.out.println("Boolean parameter: " + b);
    }
    public static void universalMethod(int a, String s) {
        System.out.println("Integer and String parameters: " + a + ", " + s);
    }
    public static void universalMethod(int[] arr) {
        System.out.print("Array parameter: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void universalMethod(String s1, String s2) {
        System.out.println("Two String parameters: " + s1 + ", " + s2);
    }
    public static void universalMethod(char c) {
        System.out.println("Character parameter: " + c);
    }
    public static void universalMethod(long l) {
        System.out.println("Long parameter: " + l);
    }
}

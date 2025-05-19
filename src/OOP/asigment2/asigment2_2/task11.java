package OOP.asigment2.asigment2_2;

public class task11 {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }
    public static void printSqrt(int[] array) {
        String messagePrefix = "The square root of the number ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSquareRoot = Math.sqrt(element);
            System.out.println(messagePrefix + element + " is " + elementSquareRoot);
        }
    }
}

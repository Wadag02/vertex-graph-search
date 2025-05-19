package OOP.asigment3.asigment3_1;

public class task7 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }

    interface Desire {
    }

    interface Dream {
        Hobby HOBBY = new Hobby(); // Interface variables must be public, static, and final by default
    }

    static class Hobby implements Desire { // Class must be declared static if used in static context
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}

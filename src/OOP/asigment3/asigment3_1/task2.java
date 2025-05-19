package OOP.asigment3.asigment3_1;

public class task2 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("Dog is moving.");
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void move() {
            System.out.println("Duck is moving.");
        }

        @Override
        public void fly() {
            System.out.println("Duck is flying.");
        }

        @Override
        public void eat() {
            System.out.println("Duck is eating.");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("Car is moving.");
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {
            System.out.println("Airplane is moving.");
        }

        @Override
        public void fly() {
            System.out.println("Airplane is flying.");
        }
    }
}

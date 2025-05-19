package OOP.asigment3.asigment3_1;

public class task3 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public class Human implements CanRun, CanSwim {
        @Override
        public void run() {
        }

        @Override
        public void swim() {
        }
    }

    public class Duck implements CanFly, CanRun, CanSwim {
        @Override
        public void fly() {
        }

        @Override
        public void run() {
        }

        @Override
        public void swim() {
        }
    }

    public class Penguin implements CanRun, CanSwim {
        @Override
        public void run() {
        }

        @Override
        public void swim() {
        }
    }

    public class Airplane implements CanFly {
        @Override
        public void fly() {
        }
    }
}

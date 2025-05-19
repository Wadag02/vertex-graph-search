package OOP.asigment3.asigment3_1;

public class task11 {
    public static void main(String[] args) {
    }

    // can move
    public interface Movable {
        void move();
    }

    // can be eaten
    public interface Edible {
        void beEaten();
    }

    // might eat someone
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Eat, Edible {
        @Override
        public void move() {
            System.out.println("The cat is moving.");
        }

        @Override
        public void eat() {
            System.out.println("The cat is eating someone.");
        }

        @Override
        public void beEaten() {
            System.out.println("The cat is being eaten.");
        }
    }

    public class Dog implements Movable, Eat {
        @Override
        public void move() {
            System.out.println("The dog is moving.");
        }

        @Override
        public void eat() {
            System.out.println("The dog is eating someone.");
        }
    }

    public class Mouse implements Movable, Edible {
        @Override
        public void move() {
            System.out.println("The mouse is moving.");
        }

        @Override
        public void beEaten() {
            System.out.println("The mouse is being eaten.");
        }
    }
}

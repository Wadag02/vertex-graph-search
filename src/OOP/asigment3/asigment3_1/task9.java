package OOP.asigment3.asigment3_1;

public class task9 {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }
}

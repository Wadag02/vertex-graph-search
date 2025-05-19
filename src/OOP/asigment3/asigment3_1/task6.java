package OOP.asigment3.asigment3_1;

public class task6 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {
            System.out.println("Screen selected.");
        }

        @Override
        public void refresh() {
            System.out.println("Screen refreshed.");
        }
    }
}

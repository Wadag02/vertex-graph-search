package OOP.asigment2.asigment2_1;

public class task11 {
    public static int[][][][] multiArray = new int[][][][]{
            {
                    {{4, 8, 15}, {16}},
                    {{23, 42}, {}},
                    {{1}, {2}, {3}, {4, 5}}
            }
    };

    public static void main(String[] args) {
        for (int[][][] threeDArray : multiArray) {
            for (int[][] twoDArray : threeDArray) {
                for (int[] oneDArray : twoDArray) {
                    for (int num : oneDArray) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}

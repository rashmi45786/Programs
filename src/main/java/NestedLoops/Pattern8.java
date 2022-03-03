package NestedLoops;

public class Pattern8 {
    public static void main(String[] args) {
        invertedPyramid();
      /*  int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println("");
        }*/
    }

    static void invertedPyramid() {
        int rows = 5;
        for (int i = rows; i >= 1; --i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for (int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

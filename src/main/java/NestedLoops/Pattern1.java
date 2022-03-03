package NestedLoops;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to print patterns: ");
        int value = sc.nextInt();
        increasingTriangle(value);
        decreasingTriangle(value);
        rightTriangle(value);
        rightTriangleInverted(value);

    }

    public static void increasingTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void decreasingTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 5 - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rightTriangleInverted(int n) {
        int i, j, k;
        for (i = 1; i <= n; i++) {

            for (k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

}

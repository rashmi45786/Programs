import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
       // increase(1, 5);
        Scanner sc = new Scanner(System.in);
        int value= sc.nextInt();
        recurse(value);
    }

    private static void increase(int i, int n) {
        if (i == n + 1) {
            return;
        }
        System.out.println(i + "");
        increase(i + 1, n);
        System.out.println(i + "");
    }

    public static void recurse(int n) {

        if (n != 0) {
            System.out.println(n);
            recurse(n - 1);
            System.out.println(n);
        }

    }
}


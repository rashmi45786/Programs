public class Numbers {

    public static void main(String[] args) {

        printList(3);

    }

    static void printList(int n) {
        System.out.println(n);
        while (n > 1) {
            n = n - 1;
            System.out.println(n);
        }
        reverse(n-1);
    }

    static void reverse(int n) {
        while (n != 3) {
            n=n+1;
            System.out.println(n);
        }
    }
}

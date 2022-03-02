public class Arrays {
    public static void main(String[] args) {
       /* System.out.println("Largest in given array is " + MaxNumber());
        System.out.println("Third largest number is " + ThirdMax());*/
        int result = recursion(10);
        System.out.println(result);
        }

    static int MaxNumber() {
        int[] arr = {10, 20, 32, 800, 50};
        int max = arr[0];
        int length = arr.length;

        for (int i = 0; i < length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    static int ThirdMax() {

        int[] arr = {10, 20, 30, 40, 50, 100};
        int length = arr.length;
        int first = arr[0];
        int second = arr[0];
        int third = arr[0];

        for (int i = 0; i < length; i++) {
            if (arr[i] > first)
                first = arr[i];
        }
        for (int i = 0; i < length; i++) {
            if (arr[i] < second && arr[i] > first) {
                second = arr[i];
            }
        }
        for (int i = 0; i < length; i++) {
            if (arr[i] > second && arr[i] > first && arr[i] < third) {
                third = arr[i];
            }
        }

        return third;
    }

    public static int recursion(int k) {
        if (k > 0) {
            return k + recursion(k - 1);
        } else {
            return 0;
        }
    }

   /* public static void main(String[] args) {

        int fact = 1;
        int num =5;
        fact = Factorial(num);
        System.out.println("Factorial of "+num+" is "+fact);

    }*/

    static int Factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return (n * Factorial(n - 1));
        }
    }


}

package hcl;

public class EvenOdd {
    public static String isEven(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        int n = 5;

        String result = isEven(n);
        System.out.println(result);
    }
}

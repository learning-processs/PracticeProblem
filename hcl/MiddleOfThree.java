public class MiddleOfThree {

    public static int middle(int a, int b, int c) {

        if ((a < b && b < c) || (c < b && b < a)) {
            return b;
        } else if ((b < a && a < c) || (c < a && a < b)) {
            return a;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int b = 20, a = 30, c = 40;
        System.out.println(middle(a, b, c));
    }
}

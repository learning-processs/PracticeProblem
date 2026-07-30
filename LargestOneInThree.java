public class LargestOneInThree {
    public static void main(String[] args) {
        int c = 10;
        int d = 22;
        int e = 90;

        if (c >= d) {
            if (c >= e) {
                System.out.println("C : " + c);
            } else {
                System.out.println("E : " + e);
            }
        } else {
            if (d >= e) {
                System.out.println("D : " + d);
            } else {
                System.out.println("E : " + e);
            }
        }
    }
}
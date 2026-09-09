public class Swap {
    public static void main(String[] args) {
        int a = 20; int b = 40;

        // int tem = a;
        // a = b ; 
        // b = tem;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println( "A : " + a + ", " + "B : " + b);
    }
}

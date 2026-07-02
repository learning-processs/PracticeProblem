public class SwapTwoNuber {
    public static void main(String[] args) {
        int a = 20 ; int b = 30;
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = a+b; // 50
        b = a-b; // 20
        a = a-b;  //30

        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}

public class GreatestOfThree {
    public static int largestOne(int a , int b , int c){

        if(a >= b && a >= c){
            return a;
        }else if( b >= a && b >= c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String[] args) {
        
        int a = 11, b =12, c = 9;
        System.out.println(largestOne(a, b, c));
    }
}

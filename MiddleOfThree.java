public class MiddleOfThree {

    public static int middleOfThree( int a , int b ,int c){

        if((a < b && b < c) ||(c <b && b < a)){
            return b;
        }else if(( b < a && a < c) || ( c < a && a < b)){
            return a;
        }else{
            return c;
        }
    }
    
    public static void main(String[] args) {
        
        int a = 20;
        int b = 30;
        int c = 40;

        System.out.println(middleOfThree(a, b, c));
    }
}

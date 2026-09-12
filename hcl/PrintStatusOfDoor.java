public class PrintStatusOfDoor {

    public static void printStatus(int n){
        for(int i = 1 ; i <= n ; i++){
            int divisor = 0;
            for(int j = 1 ; j <= i ; j++){
                if(i %j == 0){
                    divisor ++;
                }
            }

            if(divisor % 2 == 0){
                System.out.print("Closed -> ");
            }else{
                System.out.print("Open -> ");
            }
        }
    }
    public static void main(String[] args) {
           int n = 5;
           printStatus(n );
    }
}

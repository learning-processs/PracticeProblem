// public class BinaryRep {

//     static String getBinary(int n){

//         char [] ans = new char[32];

//         for(int i = 0 ; i < 32 ; i++)
//             ans[i] = '0';

//         for(int i = 0 ; i < 32 ;i++){
//             if( n % 2 == 1)
//                 ans[31-i] = '1';

//             n = n/2;
//         }

//         return new String(ans);
//     }
//     public static void main(String[] args) {
        
//         int n = 4;

//         System.out.println(getBinary(n));

//     }
// }


public class BinaryRep {

    static String getBinary(int n){

        char[] ans = new char[32];

        for(int i = 0 ; i < 32 ; i++){
            ans[i] = '0';
        }

        for(int i = 0 ;  i < 32 ; i++){

            if(n % 2 == 1){
                ans[31 - i ] = '1';
            }

            n = n/2;

        }

        return new String(ans);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(getBinary(n));
    }
}

   

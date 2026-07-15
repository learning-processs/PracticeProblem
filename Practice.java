// ----------------------------Odd & Even-------------------

// public class Practice {

//     public static void main(String[] args) {
//         int n = 15;
//         if(n % 2 == 0){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//     }
// }




// ----------------------------Swap Two Numbers Without Using Third Variable-------------------

// public class Practice {

//     public static void main(String[] args) {
        
//         int a = 2; int b = 3;

//         System.out.println(a + "-> A & " + b + "-> B" );

//         a = a + b;
//         b = a - b;
//         a = a - b;

//         System.out.println("After Swap : "  + a + "-> A & " + b + "-> B" );
//     }
// }


// ----------------------------Largest element in an Array-------------------

// public class Practice {

//     static int larget(int[] arr){
//         int max = arr[0];

//         for(int i = 0 ; i < arr.length ; i++){
//             if(arr[i]> max){
//                 max = arr[i];
//             }
//         }

//         return max;
//     }

//     public static void main(String[] args) {
//        int  arr[] = {10, 20, 4};

//        System.out.println(larget(arr));
//     }
// }

// ----------------------------Sum of Array-------------------

// public class Practice {

//     public static int SumofArray(int arr[]){
//         int sum = 0;

//         for(int i = 0 ; i < arr.length ; i++){
//             sum += arr[i];           
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3};

//         System.out.println(SumofArray(arr));
//     }
// }


// ----------------------------Reverse a String in Java-------------------

// public class Practice {

//     public static void main(String[] args) {
//         String s = "Anu";
//         String res = " ";

//         for(int i = 0 ; i < s.length() ; i++){
//             res=s.charAt(i) + res;
//         }
//         System.out.println(res);
//     }
// }


// import java.util.ArrayList;

// public class Practice {

//     public static boolean checkElement(int start, int end,int arr[]){

//         if(start > end){
//             return false;
//         }

//         for(int i = start ; i <= end ; i++){
//             boolean found = false;

//             for( int j = 0 ; j < arr.length ; j++){

//                 if(arr[j] == i){
//                     found = true;
//                     break;
//                 }
//             }

//             if(!found){
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 4, 5, 2, 7, 8, 3} ;
//         int start = 2; int end = 5 ;

//         System.out.println(checkElement(start, end, arr));
//     }
// }

/**
 * Practice
 */

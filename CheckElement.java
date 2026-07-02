// import java.util.ArrayList;
// import java.util.Arrays;

// public class CheckElement {

//     static boolean checkElement(int start , int end , ArrayList<Integer> arr){

//             if( start > end){
//                 return false;
//             }

//             for(int i = start ; i <= end ;i ++){

//                 boolean found = false;

//                 for(int j = 0 ; j < arr.size() ; j++ ){

//                     if(arr.get(j) == i){
//                         found = true;
//                         break;
//                     }
//                 }
//             }
//             return true;
//         }
//     public static void main(String[] args) {

//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 4,5, 2, 7, 8, 3));
//         int start = 2; 
//         int end = 5;
        
//         if(checkElement(start, end , arr)){
//             System.out.println("True");
//         }else{
//             System.out.println("False");
//         }
//     }
// }


public class CheckElement {

    static boolean checkElements(int start, int end , int arr[]){

        if(start > end){
            return false;
        }

        for(int i = start ; i<=end ;i++){
            boolean found = false;

            for(int j = 0 ; j < arr.length ;j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {

        int arr [] = { 1, 4, 5, 2, 8, 3};

        int start = 2; 
        int end = 5;

        if(checkElements(start, end, arr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
}

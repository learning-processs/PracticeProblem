package hcl;

public class RangeElem {

    static boolean checkElement(int arr[], int start, int end){

        if(start > end){
            return false;
        }

        for(int i = start ; i <= end ; i++){
            boolean found = false;

            for(int j = 0 ; j < arr.length; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }

            if(!found){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 5, 2, 7, 8, 3} ; 
        int start = 2; 
        int end = 5; 

        System.out.println(checkElement(arr, start, end));
    }
}

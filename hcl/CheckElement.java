import java.util.ArrayList;

public class CheckElement {

    public  static  boolean checkElement(int start , int end , int arr[]){
        if(start > end){
            for(int i = start ; i <= end ; i++){
                boolean found = false;
                for(int j = 0 ; j < arr.length ; i++){
                    if(arr[j] == i){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    return  false;
                }
            }
        }
        return  true;

    }
    public static void main(String[] args) {
        
        int arr []= { 1, 4, 5, 2, 7, 8, 3};
        int s = 2;
        int e = 5;

        if(checkElement(s, e, arr))
            System.out.println("True...");
        else
            System.out.println("False...");
    }
}

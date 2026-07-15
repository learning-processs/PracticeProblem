import java.util.Arrays;

public class RotateArray {

    public static void rotate(int arr[]){
        int lastElement = arr[arr.length - 1];

        for(int i = arr.length-1 ; i > 0 ; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = lastElement;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}


/**
 * RotateArr
 */
class RotateArr {

    public static void rotate(int arr[]){
        int lastElement = arr[arr.length - 1];

        for(int i = arr.length - 1 ; i > 0 ; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));


        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
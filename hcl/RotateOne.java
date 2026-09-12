import java.util.Arrays;

public class RotateOne {

    public static void rotate(int arr[]){
        int lastElement = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--){
              arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("Before : ");
        for(int i = 0 ;  i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        rotate(arr);
        System.out.print("After : ");
        System.out.println(Arrays.toString(arr));
    }
}
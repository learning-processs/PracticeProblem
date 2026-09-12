import java.util.Arrays;

public class DupLastIndex {

    public static  int[] dupLastIndex(int arr[]){
        int [] res = { -1, -1};

        for(int i = 0; i < arr.length- 1; i++){
            if(arr[i] == arr[i + 1]){
                res[0] = i + 1;
                res[1] = arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 5, 5, 6, 6, 7 };

        int[] res = dupLastIndex(arr);

        System.out.println(Arrays.toString(res));
    }
}

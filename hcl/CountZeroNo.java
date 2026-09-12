
public class CountZeroNo {

    public static int countzero(int arr[]){
        int n = arr.length;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                return  n - i;
            }

        }
        return  0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 0, 0};
        System.out.println(countzero(arr));
    }
}

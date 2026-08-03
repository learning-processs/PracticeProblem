public class IsSorted {

    public static boolean isSorted(int arr[]){
        int n  = arr.length;

        for(int i = 1 ; i < n ; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int arr[] = { 90,10, 20, 30, 40, 50 };
        int n = arr.length;

        if (isSorted(arr))
            System.out.print("true\n");
        else
            System.out.print("false\n");
    }
}

public class BinarySearch {

    public static int binarySearch(int arr[], int target){
        int low = 0 ; int high = arr.length;

        while (low <= high) {
            int mid = low + (high - low)/2 ;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                high =mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return - 1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        System.out.println(binarySearch(arr, x));

    }
}

public class Arraysum2 {

    static int arraySum(int arr[], int n){
        
        if(n <= 0){
            return 0;
        }

        return arraySum(arr , n -1) + arr[n-1];
    }
    public static void main(String[] args) {
        int arr[] = { 1,2, 4,5};

        int sum = arraySum(arr, arr.length);
        System.out.println("Sum : " + sum);
       
    }
}

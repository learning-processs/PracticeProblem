package hcl;

public class ArraySum {

    static int sumOfArray(int arr[]){
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 15 };

        System.out.println(sumOfArray(arr));
    }
}

package josh;
// Max subarray sum, no two adjacent elements (array DP)

// public class MaxSubArraySum {

//     public static int maxSum(int arr[]){

//         int n = arr.length;

//         if( n == 0){
//             return 0;
//         }

//         if(n == 1){
//             return arr[0];
//         }

//         int [] dp = new int[n];
//         dp[0] = arr[0];
//         dp[1] = arr[1];

//         for(int i = 2 ; i < n ; i++){
//             dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
//         }

//         return dp[n - 1];
//     }
    
//     public static void main(String[] args) {
        
//         int[] arr = {5, 5, 10, 100, 10, 5};

//         System.out.println(maxSum(arr));
//     }
// }


public class MaxSubArraySum {

    public static int maxSum(int arr[]){
        int n = arr.length;

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return arr[0];
        }

        int [] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];

        for(int i = 2 ; i < n ; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 100, 10, 5};

        System.out.println(maxSum(arr));
    }
}
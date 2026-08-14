package josh;

public class MaxSubarraySumCircular {

    public static int maxSubarraySumCircular2(int arr[]){

        int totalSum = 0;

        int currMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currMin = 0;
        int minSum = Integer.MAX_VALUE;

        for(int x : arr){
            currMax = Math.max(x , currMax + x);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(x, currMin + x);
            minSum = Math.min(minSum, currMin);

            if(maxSum < 0){
                return maxSum;
            }
        }
        return Math.max(maxSum, totalSum - minSum);
    }

    public static int maxSubarraySumCircular(int[] arr) {
        int totalSum = 0;

        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int x : arr) {
            currentMax = Math.max(x, currentMax + x);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(x, currentMin + x);
            minSum = Math.min(minSum, currentMin);

            totalSum += x;
        }
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);

    }

    public static void main(String[] args) {

        int[] arr = { 5, -2, 3, 4 };

        System.out.println(maxSubarraySumCircular(arr));

    }
}

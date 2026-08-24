package hcl;

public class ShortestDist {
    static int min_dist = Integer.MAX_VALUE;

    static int minDist(int arr[], int x ,int y){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if((x ==arr[i] && y==arr[j] || y ==arr[i] && x == arr[j]) && min_dist > Math.abs(i - j)){
                    min_dist = Math.abs(i - j);
                }
            }
        }

        return min_dist > arr.length ? - 1 : min_dist;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(minDist(arr, 10, 50));
    }
}

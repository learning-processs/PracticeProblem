public class MinDis {

    static int minDist(int arr[], int x ,int y){

        int n = arr.length;
        int min_dist = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if((x == arr[i] && y == arr[j] || y==arr[i] && x == arr[j]) && min_dist > Math.abs( i - j)){
                    min_dist =Math.abs(i - j);
                }
            }
        }

        return min_dist > n ? - 1 : min_dist;
    }

    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 50};

        System.out.println(minDist(arr, 10, 50));
    }
}
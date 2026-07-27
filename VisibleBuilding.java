public class VisibleBuilding {

    static int visibleBuilding(int arr[]){
        int ans = 0;

        for(int i = 0 ; i < arr.length ; i++){
            boolean flag = true;

            for(int j = 0 ; j < i ; j++){
                
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        
        int[] arr = {6, 2, 8, 4, 11, 13};
        System.out.println(visibleBuilding(arr));
    }
}

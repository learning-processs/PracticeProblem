public class VisibleBuilding {

    static int visibleBuildings(int arr[]){
        int ans = 1;
        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i] >= max){
                ans++;
                max = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {6, 2, 8, 4, 11, 13};
        
        System.out.println(visibleBuildings(arr));
    }
}

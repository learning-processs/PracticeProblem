public class TwoRepeated {
    public static int[] twoRepeated(int arr[]){

        int x = -1 ; int y = -1;
        for(int i = 0 ; i < arr.length -1; i++){
            for(int j = i + 1 ; j <= arr.length - 1 ;j++){
                if(arr[i] == arr[j]){
                    if(x == -1){
                        x = arr[i];
                    }else{
                        y = arr[i];
                    }
                }
            }
        }
        return new int[]{x , y};

    }
    public static void main(String[] args) {
         int arr[] = { 4, 2, 4, 5, 2, 3, 1 };

         int ans[] = twoRepeated(arr);

         for(int i : ans){
            System.out.print(i + " , ");
         }
    }
    
}

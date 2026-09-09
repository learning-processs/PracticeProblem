public class LargestElem {
    public  static int maxOne(int arr[]){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return   max;
    }
    public static void main(String[] args) {
        int arr[] = {20, 10, 20, 4, 100};

        int result = maxOne(arr);
        System.out.println(result);
    }
}

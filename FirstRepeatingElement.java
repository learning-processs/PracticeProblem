public class FirstRepeatingElement {

    public static int firstRepeated(int arr[]){
        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if( arr[i] == arr[j]){
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int index = firstRepeated(arr);
        System.out.println(index);
    }
}

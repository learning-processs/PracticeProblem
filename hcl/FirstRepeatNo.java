public class FirstRepeatNo {
    public static int firstRepeatedNo(int arr[]){

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int number = firstRepeatedNo(arr);
        System.out.println(number);
    }
}

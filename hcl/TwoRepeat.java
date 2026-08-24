package hcl;

public class TwoRepeat {

    static int [] twoRepeat(int arr[]){
    int x = -1; int y = -1;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+ 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    if(x == -1){
                        x = arr[i];
                    }else{
                        y = arr[j];
                    }
                }
            }
        }
        return new int[] { x, y};
    }
    public static void main(String[] args) {
        int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
        System.out.println(arr[0] + " " +  arr[1]);
    }
}

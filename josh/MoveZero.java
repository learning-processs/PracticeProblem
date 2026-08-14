package josh;

import java.util.ArrayList;
import java.util.List;

public class MoveZero {

    public static List<Integer> moveZero(int arr[]){
        List<Integer> list = new ArrayList<>();
        int zero = 0;

        for(int x : arr){
            if(x == 0){
                zero++;
            }else{
                list.add(x);
            }
        }

        while(zero > 0){
            list.add(0);
            zero--;
        }

        return list;
    }
    public static void main(String[] args) {
        int arr[] = {0,1 , 0,3,12};

        System.out.println(moveZero(arr));
    }
}

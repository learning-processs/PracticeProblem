import java.util.ArrayList;

public class CountLessEqual {

    public static ArrayList<Integer> countLessEq(int[] a , int[] b){

        int n = a.length;
        int m = b.length;

        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            int count = 0 ;

            for(int j = 0 ; j < m ; j++){

                if(b[j] <= a[i]){
                    count++;
                }
            }

            res.add(count);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 7, 9};
        int[] b = {0, 1, 2, 1, 1, 4};

        ArrayList<Integer> result = countLessEq(a ,b);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}

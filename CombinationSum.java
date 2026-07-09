import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private static void backtrack(int [] candidates , int target, int index, List<Integer> current, List<List<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }

        if( target < 0 ||index == candidates.length){
            return;
        }

        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, ans);
        current.remove(current.size() - 1);

        backtrack(candidates, target, index + 1, current, ans);
    }



    public static void main(String[] args) {
        int [] candidates = {2,3,6,7}; int target = 7;

        System.out.println(combinationSum(candidates, target));

    }
}

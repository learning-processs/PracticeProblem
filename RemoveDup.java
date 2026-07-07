// public class RemoveDup {

//     public static int removeDuplicates(int[] nums) {

//         int count = 0;

//         for(int i = 0 ; i < nums.length -1 ; i++){

//             for(int j = i + 1 ; j < nums.length - 1 ; j++){
//                 if(nums[i] == nums[j]){
//                     continue;
//                 }
//                 count ++;
//             }
//         }

//         return count;
        
//     }
//     public static void main(String[] args) {

//         int nums[] = { 1, 1, 2};
//         int nums1 [] = { 0,0,1,1,1,2,2,3,3,4 };

//         System.out.println(removeDuplicates(nums));
//     }
// }


public class RemoveDup {

     public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int i = 1;

        for(int j = 1 ; j < nums.length ; j++){
            if(nums[j] != nums[j-1]){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
     }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2};
        int nums1 [] = { 0,0,1,1,1,2,2,3,3,4 };

        System.out.println(removeDuplicates(nums));
    }
}
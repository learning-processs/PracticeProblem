// import java.util.ArrayList;
// import java.util.Arrays;

// public class FindMedianSortedArrays {

//     static int[] combineArray(int nums1[], int nums2[]) {

//         ArrayList<Integer> newArray = new ArrayList<>();
//         int i = 0;
//         int j = 0;
//         while (i < nums1.length && j < nums2.length) {
//             if (nums1[i] < nums2[j]) {
//                 newArray.add(nums1[i]);
//                 i++;
//             } else {
//                 newArray.add(nums2[j]);
//                 j++;
//             }
//         }

//         while (i < nums1.length) {
//             newArray.add(nums1[i]);
//             i++;
//         }

//         while (j < nums2.length) {
//             newArray.add(nums2[j]);
//             j++;
//         }

//         int[] result = new int[newArray.size()];
//         for (int k = 0; k < newArray.size(); k++) {
//             result[k] = newArray.get(k);
//         }
//         return result;
//     }

//     static double findMedian(int nums1[], int nums2[]) {

//         int merged[] = combineArray(nums1, nums2);

//         int n = merged.length;

//         if (n % 2 == 1) {
//             return merged[n / 2];
//         } else {
//             return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
//         }
//     }

//     public static void main(String[] args) {
//         int nums1[] = { 1, 3 };
//         int nums2[] = { 2 };

//         int num3[] = { 1, 2 };
//         int num4[] = { 3, 4 };

//         System.out.println(Arrays.toString(combineArray(nums1, nums2)));
//         System.out.println(findMedian(num3, num4));

//     }
// }


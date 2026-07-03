import java.util.ArrayList;
import java.util.Arrays;

public class FindMedianSortedArrays {

    static int[] combineArray(int num1[], int num2[]) {

        ArrayList<Integer> newArray = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                newArray.add(num1[i]);
                i++;
            } else {
                newArray.add(num2[j]);
                j++;
            }
        }

        while (i < num1.length) {
            newArray.add(num1[i]);
            i++;
        }

        while (j < num2.length) {
            newArray.add(num2[j]);
            j++;
        }

        int[] result = new int[newArray.size()];
        for (int k = 0; k < newArray.size(); k++) {
            result[k] = newArray.get(k);
        }
        return result;
    }

    static double findMedian(int num1[], int num2[]) {

        int merged[] = combineArray(num1, num2);

        int n = merged.length;

        if (n % 2 == 1) {
            return merged[n / 2];
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int num1[] = { 1, 3 };
        int num2[] = { 2 };

        int num3[] = { 1, 2 };
        int num4[] = { 3, 4 };

        System.out.println(Arrays.toString(combineArray(num1, num2)));
        System.out.println(findMedian(num3, num4));

    }
}

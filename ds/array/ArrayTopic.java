package ds.array;

import java.util.Arrays;

public class ArrayTopic {
    public static void main(String[] args) {
        int rollNo[] = new int[5];
        rollNo[0] = 1;
        rollNo[1] = 5;
        rollNo[2] = 10;
        rollNo[3] = 15;
        rollNo[4] = 20;

        for (int i = 0; i < rollNo.length; i++) {
            System.out.print(rollNo[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(rollNo));
    }
}

/**
 * MultiDimention
 */
class MultiDimention {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 4 },
                { 5, 6, 7 },
        };
    }
}
package ds.array;

import java.util.Arrays;
import java.util.Scanner;

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

        // int[][] matrix = {
        //         { 1, 2, 4 },
        //         { 5, 6, 7 },
        // };

        int [][] arr= new int[3][2];
        Scanner sc = new Scanner(System.in);

        // Input
        for(int row = 0; row < arr.length ; row++){
            for(int col = 0; col < arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //Ouput
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
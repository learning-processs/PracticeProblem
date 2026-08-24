// public class Z {

//     public static String reverse(String str){
//         String res = " ";

//         for(int i = 0; i < str.length() ; i++){
//             char ch = str.charAt(i);
//             res = ch + res;
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         String str = "Jia";
//         System.out.println(reverse(str));
//     }
// }

// public class Z {

//     public static boolean isPalindrome(String str){
//         int left = 0;
//         int right = str.length() -1;

//         while (left < right) {
//             if(str.charAt(left) != str.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "abccba";
//         System.out.println(isPalindrome(str));
//     }
// }

// public class Z {

//     public static boolean isPalindrome(int num){
//         int original  = num;
//         int rev = 0;

//         while (num > 0) {
//             int  digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }
//         return original == rev;
//     }

//     public static void main(String[] args) {
//         int num = 12321;
//         System.out.println(isPalindrome(num));
//     }
// }

// public class Z {

//     public static int findSecondLargest(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for(int i = 0 ; i < arr.length ; i++){
//             if(arr[i] > largest){
//                 secondLargest = largest;
//                 largest = arr[i];
//             }else if(arr[i] > secondLargest && arr[i] != largest){
//                 secondLargest = arr[i];
//             }
//         }

//         return secondLargest;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 10, 5, 20, 8 , 15};

//         System.out.println(findSecondLargest(arr));
//     }
// }

// import java.util.Arrays;

// public class Z {

//     public static int[] removeDup(int arr[]) {

//         int[] temp = new int[arr.length];
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {

//             boolean dup = false;

//             for (int j = 0; j < count; j++) {
//                 if (arr[i] == temp[j]) {
//                     dup = true;
//                     break;
//                 }
//             }

//             if (!dup) {
//                 temp[count] = arr[i];
//                 count++;
//             }
//         }

//         int[] res = new int[count];
//         for (int i = 0; i < count; i++) {
//             res[i] = temp[i];
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 10, 20, 10, 30, 20, 40 };

//         System.out.println(Arrays.toString(removeDup(arr)));

//     }
// }

// import java.util.HashSet;

// public class Z {

//     public static void main(String[] args) {
//         int arr[] = { 10, 20, 10, 30, 20, 40 };

//         HashSet<Integer> set = new HashSet<>();

//         for(int num : arr){
//             set.add(num);
//         }

//         System.out.println(set);
//     }
// }

// public class Z {

//     public static void charFrequency(String str){
//         int [] freq = new int[256];

//         for(int i = 0 ; i < str.length(); i++){
//             char ch = str.charAt(i);
//             freq[ch]++;
//         }

//         for(int i = 0; i < 256 ; i++){
//             if(freq[i] > 0){
//                 System.out.println((char)i + " = " + freq[i]);
//             }
//         }
//     }
//     public static void main(String[] args) {

//         String str = "hello";
//         charFrequency(str);
//     }
// }

// public class Z {

//     public static void charFrequency(String str){
//         int[] freq = new int[256];

//         for(int i = 0 ; i < str.length() ; i++){
//             char ch = str.charAt(i);
//             freq[ch]++;
//         }

//         for(int i = 0; i < 256; i++){
//             if(freq[i] > 0){
//                 System.out.println((char)i + " = " + freq[i]);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         String str = "hello";
//         charFrequency(str);
//     }
// }

// public class Z {

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 2, 3, 1, 2};
//         int freq[] = new int[10];

//         for(int i = 0; i < arr.length ; i++){
//             freq[arr[i]]++;
//         }

//         for(int i = 0 ; i < freq.length ; i++){
//             if(freq[i] > 0){
//                 System.out.println(i + " = " + freq[i]);
//             }
//         }
//     }
// }

// public class Z {

//     public static int findMissingNum(int arr[]){

//         for(int i = 1 ; i <= arr.length; i++){
//             boolean foud = false;
//             for(int j = 0 ; j < arr.length ; j++){
//                 if(i == arr[j]){
//                     foud = true;
//                     break;
//                 }
//             }

//             if(!foud){
//                 return i;
//             }

//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 4, 5};
//         System.out.println(findMissingNum(arr));
//     }
// }

// public class Z {

//     public static void twoSum(int arr[], int target) {

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     System.out.println(i + " " + j);
//                 }
//             }
//         }
//     }

//     public static void sort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//     }

    // public static void findDup(int arr[]){
    // for(int i = 0 ; i < arr.length ; i++){
    // for(int j = i + 1 ; j < arr.length ; j++){
    // if(arr[i] == arr[j]){
    // System.out.println("Duplicate : " + arr[i]);
    // break;
    // }
    // }
    // }
    // }

    // public static void flatten(int arr[][]) {

    //     for (int i = 0; i < arr.length; i++) {

    //         for (int j = 0; j < arr[i].length; j++) {
    //             System.out.print(arr[i][j] + " ");
    //         }
    //     }
    // }

//     public static void main(String[] args) {

//         int[] arr = { 1, 2, 3, 2, 4, 1, 5 };
//         int target = 9;

//         twoSum(arr, target);
//         sort(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//             System.out.println();
//         }

//         // findDup(arr);
//         System.out.println("Flatten Array : ");
//         int[][] twoD = {
//                 { 1, 2 },
//                 { 3, 4 },
//                 { 5, 6 }
//         };

//         flatten(twoD);

//     }
// }

import java.util.Scanner;

class Z1 {

    // static int factorial(int n){
    //     if(n == 0 || n ==1){
    //         return 1;
    //     }

    //     return n * factorial(n - 1);
    // }

    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return n * factorial(n - 1);
    }


    static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static boolean isPrime(int n){

        if( n <= 1){
            return false;
        }

        for(int i = 2; i < n/2 ; i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;

        
    }

    static int gcd(int a , int b){
        if(b== 0){
            return a;
        }
        return gcd(b , a % b);
    }

    static int countDigits(int n ){
        int count = 0;
        while ( n!= 0) {
            n = n/10;
            count ++;
        }

        return count;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a Number : ");
        // int n = sc.nextInt();
        // int result = factorial(n);
        // System.out.println("Factorial of " + n + " = " +  result);


        // System.out.println("Fibonnacci Series : ");
        // for(int i = 0 ; i < n ; i++){
        //     System.out.println(fibonacci(i)+ " ");
        // }

        int n = 1234;
        System.out.println(countDigits(n));
    }
}


public class Z {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static void traverse(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    //null 10 n 20 30 40
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println("Traversal Of LinkedList : ");
        traverse(head);

        head = reverse(head);
        System.out.println("Reverse : ");
        traverse(head);
    }
}

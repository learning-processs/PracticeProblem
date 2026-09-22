public class RemoveSpace {

    public static String removeSpace(String str) {
        int n = str.length();
        char[] arr = str.toCharArray();

        for (int i = 0; i < n; i++) {
            if (arr[i] == ' ') {
                for (int j = 0; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        return new String(arr, 0, n);
    }

    public static void main(String[] args) {
        String str = " gf g";
        System.out.println(removeSpace(str));
    }
}

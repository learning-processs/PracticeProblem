
package josh;

class isPalindrom {

    public static boolean isPalindrom(String str){
        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        

        return true;
    }

    public static void main(String[] args) {
        String str = "nmtmn";
        System.out.println(isPalindrom(str));
    }
}

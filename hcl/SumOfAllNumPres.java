public class SumOfAllNumPres {

    public static int findSumOfNumber(String str) {

        int sum = 0;
        String temp = "0";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                sum = Integer.parseInt(temp);
                temp = "0";
            }

        }
        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {

        String str = "12abc20yz68";

        System.out.println(findSumOfNumber(str));
    }
}

/**
 * InnerSumOfAllNumPres
 */
class InnerSumOfAllNumPres {

    public static int findSumOfNumber2(String str){

        int sum = 0;
        String temp = "0";

        for(int i = 0 ; i < str.length() ; i++){

            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                temp += ch;
            }else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }

        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        String str = "12abc20yz68";

        System.out.println(findSumOfNumber2(str));
    }
}
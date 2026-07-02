public class Reverse {
    public static void main(String[] args) {
        // String str = "Anu";
        // String res = " ";

        // for(int i = 0 ; i < str.length() ; i++){

        //     res = str.charAt(i) + res;
        // }

        // System.out.println(res);



        String str = "Tina";
        String result = "";

        for(int i = 0 ; i < str.length() ; i++){
            result = str.charAt(i) + result;
        }

        System.out.println(result);
    }
}

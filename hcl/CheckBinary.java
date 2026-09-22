public class CheckBinary {
    public static boolean checkBinary(String str){

        int n = str.length();

        for(int i = 0 ; i < n ; i++){
            if(str.charAt(i) == '0'){
                boolean leftOne = false, rightOne = false;

                for(int j = i - 1; j >=0 ; j--){
                    if(str.charAt(j) == '1'){
                        leftOne = true;
                        break;
                    }
                }

                for(int j = i + 1 ; j < n ; j++ ){
                    if(str.charAt(j) == '1'){
                        rightOne = true;
                        break;
                    }
                }

                if(leftOne && rightOne){
                    return  false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "100";

        System.out.println(checkBinary(s) ? "true": "false");
    }
}

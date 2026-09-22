public class RemoveChar {

    public static String removeCharsFromWords(String s1, String s2){

        StringBuilder result = new StringBuilder();

        for(char ch : s1.toCharArray()){

            if(s2.indexOf(ch) == -1){
                result.append(ch);
            }
        }

        return result.toString();
       
    }

    public static void main(String[] args) {
        String s1 = "occurrence";
        String s2 = "car";
        System.out.println(removeCharsFromWords(s1, s2));
    }
}

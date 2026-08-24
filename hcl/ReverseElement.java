package hcl;

public class ReverseElement {

    static String reverse(String str){
        String r = " ";
        for(int i = 0  ; i < str.length() ; i++){

            r = str.charAt(i) + r;
        }
        return r;
    }
    public static void main(String[] args) {
        String str = "Geeks";
        String res = reverse(str);
        System.out.println(res);
    }
}

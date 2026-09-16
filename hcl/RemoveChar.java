public class RemoveChar {

    public static String removeCharsFromWords(String s1, String s2) {

        StringBuilder sb = new StringBuilder();

        for (char ch : s1.toCharArray()) {

            if (s2.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "occurrence";
        String s2 = "car";
        System.out.println(removeCharsFromWords(s1, s2));
    }
}

public class FirstNonRepeat {
    public static char nonRepeat(String s) {

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return s.charAt(i);
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(nonRepeat(s));
    }
}

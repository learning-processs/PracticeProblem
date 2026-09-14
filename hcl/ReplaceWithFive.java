public class ReplaceWithFive {

    public static int convertFiveAllZero(int n) {
        int result = 0;
        int placeValue = 1;

        while (n > 0) {

            int digit = n % 10;

            if (digit == 0) {
                digit = 5;
            }

            result = result + digit * placeValue;
            placeValue *= 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 1004;
        System.out.println(convertFiveAllZero(n));
    }
}

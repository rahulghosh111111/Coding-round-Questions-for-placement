public class Palindrome {
    public static void main(String[] args) {
        int n = 111;
        int revN = 0;
        int dup = n;

        while (n > 0) {
            int lastDigit = n % 10;
            revN = (revN * 10) + lastDigit;
            n = n / 10;
        }

        if (dup == revN) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

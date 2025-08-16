public class ReverseNumber {
    public static void main(String[] args) {
        int n = 3489;
        int revN= 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revN = (revN * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(revN);
    }
}

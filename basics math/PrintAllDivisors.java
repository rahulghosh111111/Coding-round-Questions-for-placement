public class PrintAllDivisors {
    static void divisorfunction(int n) {
        for (int i = 1; i <= n; i++) {  // Start from 1 to avoid divide by zero
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 12;  // Example value
        divisorfunction(n);
    }
}

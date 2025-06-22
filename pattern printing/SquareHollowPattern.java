public class SquareHollowPattern {
    public static void main(String[] args) {
        int m = 6; // Size of the square
        int n = 5; // Size of the square
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' for the border and ' ' for the inside
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
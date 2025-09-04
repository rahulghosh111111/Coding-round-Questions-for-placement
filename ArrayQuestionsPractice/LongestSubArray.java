package ArrayQuestionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Q. Longest SubArray with Sum k
public class LongestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.print("Array size must be greater than 0.");
            sc.close();
            return;
        }

        List<Integer> list = new ArrayList<>();
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        int maxLen = 0;

        // Brute force: check all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += list.get(j);
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        System.out.println("Length of the Longest Subarray with sum " + k + " is: " + maxLen);

        sc.close();
    }
}

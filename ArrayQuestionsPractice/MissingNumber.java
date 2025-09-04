package ArrayQuestionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n (numbers from 1 to n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n must be greater than 0.");
            sc.close();
            return;
        }

        List<Integer> list = new ArrayList<>();
        System.out.print("Enter " + (n - 1) + " elements (1 to n, one missing): ");
        for (int i = 0; i < n - 1; i++) {
            list.add(sc.nextInt());
        }

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : list) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The Missing Number is: " + missingNumber);

        sc.close();
    }
}

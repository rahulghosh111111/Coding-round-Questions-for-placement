package ArrayQuestionsPractice;

import java.util.Scanner;

public class NumberOnceOthersTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= arr[i]; // XOR all elements
        }
        System.out.println("The number that appears once is: " + result);
        sc.close();
    }
}
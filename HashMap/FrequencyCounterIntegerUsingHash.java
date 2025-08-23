package HashMap;
import java.util.Scanner;

public class FrequencyCounterUsingHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (values between 0 and 12):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }


        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter the numbers to check frequency:");
        while (q-- > 0) {
            int number = sc.nextInt();
            if (number < 0 || number >= hash.length) {
                System.out.println("Invalid number! Please enter between 0 and 12.");
            } else {
                System.out.println("Frequency of " + number + " = " + hash[number]);
            }
        }
        sc.close();
    }
}

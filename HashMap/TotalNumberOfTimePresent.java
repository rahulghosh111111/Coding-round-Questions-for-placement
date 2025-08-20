package HashMap;
import java.util.*;

public class TotalNumberOfTimePresent {
    static int f(int[] arr, int x) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to count: ");
        int x = sc.nextInt();

        int result = f(arr, x);
        System.out.println(x + " occurs " + result + " times in the array.");
    }
}




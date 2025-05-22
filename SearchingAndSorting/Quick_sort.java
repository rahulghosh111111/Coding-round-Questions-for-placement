import java.util.*;
import java.util.Scanner;

public class Quick_sort {

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[si];
        int idx1 = si + 1;
        int idx2 = ei;

        while (idx1 <= idx2) {
            while (idx1 <= ei && arr[idx1] < pivot) idx1++;
            while (arr[idx2] > pivot) idx2--;
            if (idx1 <= idx2) {
                int temp = arr[idx1];
                arr[idx1] = arr[idx2];
                arr[idx2] = temp;
                idx1++;
                idx2--;
            }
        }

        int temp = arr[si];
        arr[si] = arr[idx2];
        arr[idx2] = temp;

        return idx2;
    }

    public static void quick_sort(int[] arr, int si, int ei) {
        if (si < ei) {
            int pi = partition(arr, si, ei);
            quick_sort(arr, si, pi - 1);
            quick_sort(arr, pi + 1, ei);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quick_sort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

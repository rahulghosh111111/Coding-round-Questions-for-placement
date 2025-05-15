// Java implementation of iterative Binary Search

import java.io.*;
import java.util.Scanner;
class BinarySearch {
  
    int binarySearch(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch bs = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();

        int i= bs.binarySearch(arr, x);
        System.out.println("The element is present at "
                               + "index " + i);
    }
}
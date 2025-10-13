package ArrayQuestionsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortArraysOf0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.print("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<n;i++){
            if(arr[i] == 0){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
            else{
                return;
            }
        }
        for(int i = 0; i<count0;i++) arr[i] =0;
        for(int i = count0; i<count0+count1;i++) arr[i] =1;
        for(int i = count0+count1; i<n;i++) arr[i] =2;

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

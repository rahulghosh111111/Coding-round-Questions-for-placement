package Recursion;

import static java.util.Collections.swap;
import java.util.Scanner;
public class ReverseAnArrayUsingRecursion {
    static void multipleIndex(int[] arr,int fst, int lst){

        if(fst >= lst) return;
        int temp = arr[fst];
        arr[fst] = arr[lst];
        arr[lst] = temp;
        multipleIndex(arr,fst+1,lst-1);
    }

    static void singleIndex(int[] arr,int i, int n){
        if(i>= n/2) return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        singleIndex(arr,i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        multipleIndex(arr, 0, n - 1);
        singleIndex(arr,0, n);

        System.out.println("Reversed Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

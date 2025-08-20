package Recursion;

import java.util.Scanner;

public class PalindromeStringUsingRecursion {
    static boolean singleIndexPalindrome(String[] arr,int i, int n){
        if(i>= n/2) return true;
        if (!arr[i].equals(arr[n - i - 1])) return false;

        return singleIndexPalindrome(arr,i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        System.out.println("Enter " + n + " elements:");
        for ( int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        if(singleIndexPalindrome(arr,0,n)){
            System.out.println("The array is a palindrome");
        }else{
            System.out.println("The array is not a palindrome");

        }
    }
}

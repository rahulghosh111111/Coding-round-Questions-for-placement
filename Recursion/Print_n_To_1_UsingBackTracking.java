package Recursion;

import java.util.Scanner;

public class Print_n_To_1_UsingBackTracking {
    static void f(int i , int n){
        if(i > n) return;
        f(i+1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f(1,n);
    }
}

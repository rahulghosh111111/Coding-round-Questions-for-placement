package Recursion;

import java.util.Scanner;

public class Print_1_To_n_UsingRecursion {
    static void f(int i, int n){
        if(i > n) return;
        System.out.println(i);
        f(i+1,n);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        f(n,1);
    }
}

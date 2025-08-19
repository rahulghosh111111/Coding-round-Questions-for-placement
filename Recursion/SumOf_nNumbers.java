package Recursion;

import java.util.Scanner;

public class SumOf_nNumbers {
    static void f(int i,int sum){
        if(i < 1)
        {
            System.out.println(sum);
            return;
        }
        f(i-1,sum+i);
    }
    public static void main(String[] args) {
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f(n,0);
    }
}

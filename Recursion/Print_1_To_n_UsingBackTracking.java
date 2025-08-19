package Recursion;
import java.util.Scanner;
public class Print_1_To_n_UsingBackTracking {
    static void f(int i , int n){
        if(i < 1) return;
        f(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f(n,n);
    }
}

package Recursion;
import java.util.Scanner;
public class Print_n_timesUsingRecursion {
   static void f(int i,int n){
        if(i > n) return;
        System.out.println("Rahul");
        f(i+1,n);
    }
    public static void main(String[] args) {
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f(1,n);
    }
}

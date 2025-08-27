package ArrayQuestionsPractice;

import java.util.Scanner;

public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of D: ");
        int d = sc.nextInt();
        d = d %n;


        int[] temp = new int[d];
        for(int i = 0; i<d;i++){
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];

        }
        for (int i = n-d; i < n; i++) {
            arr[i] = temp[i-(n-d)];
        }

        System.out.print("After Left Rotate: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

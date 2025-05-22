// Selection Sort Algorithm in Java
import java.util.Scanner;
public class Selection_Sort {
    public static void selectionSort(int[] arr , int n){
        
        for(int i =0; i<n-1; i++){
        int min = i;
        for(int j = i+1; j<n ; j++){
            if(arr[i] > arr[j]){
                min = j;
                if(min != i){
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr , n);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        sc.close();
    }
}

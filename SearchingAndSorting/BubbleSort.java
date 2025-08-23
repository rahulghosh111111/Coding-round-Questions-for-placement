import java.util.Scanner;
public class BubbleSort {
    static void sorting(int n,int arr[]){
        for(int j =0; j<n-1;j++){
            for(int i=0;i<n-i-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements: ");
        for(int i =0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        sorting(n,arr);
        System.out.print("Sorted Array" );
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}

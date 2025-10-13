package ArrayQuestionsPractice;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.print("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] nums = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int val = 0;
        int count =0;
        for (int i=0;i<nums.length;i++){
            if(count == 0){
                val = nums[i];
            }
            if( val == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println("Majority Element is: "+val);
    }
}

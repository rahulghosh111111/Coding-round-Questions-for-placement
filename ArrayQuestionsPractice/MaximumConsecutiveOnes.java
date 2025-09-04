package ArrayQuestionsPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.print("Array size must be greater than 0.");
            sc.close();
            return;
        }
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int maxi = 0;
        int count = 0;
        for(int i=0; i < n; i++){
            if(list.get(i) == 1){
                count++;
                if (count > maxi) {
                    maxi = count;
                }
            }else{
                count = 0;
            }

        }
        System.out.println("Maximum Consecutive Ones is : "+maxi);
    }
}

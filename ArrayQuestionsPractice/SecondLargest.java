package ArrayQuestionsPractice;
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            sc.close();
            return;
        }

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > max) {
                secondLargest = max;
                max = num;
            } else if (num > secondLargest && num != max) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second Largest element of the array is: " + secondLargest);
        }

        sc.close();
    }
}

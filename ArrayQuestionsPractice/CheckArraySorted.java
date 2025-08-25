package ArrayQuestionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        boolean isSorted = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }

        sc.close();
    }
}

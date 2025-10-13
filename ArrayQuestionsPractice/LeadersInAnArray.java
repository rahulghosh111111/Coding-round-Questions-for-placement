package ArrayQuestionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeadersInAnArray {
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

        List<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) > list.get(i)) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(list.get(i));
            }
        }

        // Sort the leaders in ascending order
        Collections.sort(leaders);

        System.out.print("Leaders in the array (sorted): ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }

        sc.close();
    }
}

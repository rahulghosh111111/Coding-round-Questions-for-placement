package ArrayQuestionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternateNumbers {
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

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : list) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        List<Integer> alternateNum = new ArrayList<>();
        int i = 0, j = 0;

        // Alternate numbers
        while (i < pos.size() && j < neg.size()) {
            alternateNum.add(pos.get(i));
            alternateNum.add(neg.get(j));
            i++;
            j++;
        }

        // Add remaining positives
        while (i < pos.size()) {
            alternateNum.add(pos.get(i));
            i++;
        }

        // Add remaining negatives
        while (j < neg.size()) {
            alternateNum.add(neg.get(j));
            j++;
        }

        System.out.println("Alternate Array: " + alternateNum);

        sc.close();
    }
}

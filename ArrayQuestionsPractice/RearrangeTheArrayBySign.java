package ArrayQuestionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RearrangeTheArrayBySign {
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

        List<Integer> rearrange = new ArrayList<>();
        int i = 0, j = 0;

        while (i < pos.size() && j < neg.size()) {
            rearrange.add(pos.get(i++));
            rearrange.add(neg.get(j++));
        }

        System.out.println("Rearranged array: " + rearrange);


    }
}

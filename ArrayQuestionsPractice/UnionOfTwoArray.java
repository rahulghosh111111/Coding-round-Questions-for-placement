package ArrayQuestionsPractice;
import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int n1 = sc.nextInt();

        if (n1 <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        HashSet<Integer> set1 = new HashSet<>();
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.println("Enter the size of the second array: ");
        int n2 = sc.nextInt();

        if (n2 <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        HashSet<Integer> set2 = new HashSet<>();
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Union of the two arrays: " + union);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
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

        System.out.print("Enter the Searching Element: ");
        int d = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == d) {
                System.out.println("The index is: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the list.");
        }

        sc.close();
    }
}

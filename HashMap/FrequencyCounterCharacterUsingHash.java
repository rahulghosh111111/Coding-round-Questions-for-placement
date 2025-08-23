package HashMap;
import java.util.Scanner;
//for both uppercase and lowercase characters
public class FrequencyCounterCharacterUsingHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.next();

        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter " + q + " characters to check their frequency:");
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            if (!Character.isLetter(c)) {
                System.out.println("Invalid input! Please enter  letters only.");
            } else {
                System.out.println("Frequency of '" + c + "' = " + hash[c]);
            }
        }

        sc.close();
    }
}

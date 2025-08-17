import static java.lang.Math.sqrt;

public class PrintAllDivisors {
    static void divisorfunction1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void divisorfunction2(int n) {
        for (int i = 1; i <= sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);

                if((n/i) != i){
                    System.out.println(n/i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 36;
//        divisorfunction1(n);
        divisorfunction2(n);

    }
}

// another way using ArrayList

/*
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {

    static List<Integer> divisorFunction1(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    static List<Integer> divisorFunction2(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);

                if ((n / i) != i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors); // To keep them in ascending order
        return divisors;
    }

    public static void main(String[] args) {
        int n = 36;

        // Using optimized function
        List<Integer> divisors = divisorFunction1(n);
        List<Integer> divisors = divisorFunction2(n);


        System.out.println("Divisors of " + n + ": " + divisors);
    }
}
     time complexity = O(sqrt(n))
*/
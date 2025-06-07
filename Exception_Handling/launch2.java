package Exception_Handling;

public class launch2 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("i don't want to print zero ");// throw keyword is used to throw an
                                                                             // exception explicitly
            // Custom exception

        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Default output " + e);

        } catch (Exception e) { // This will catch any other exceptions not caught by the previous catch blocks
            System.out.println("Something went wrong " + e); // parent class of all exceptions
        }

        System.out.println(j);
        System.out.println("Code after exception handling");
    }
}

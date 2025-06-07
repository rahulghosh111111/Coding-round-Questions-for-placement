package Exception_Handling;

public class launch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int[] arr = new int[5];
        String str = null;
        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero ");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limits");
        } catch (Exception e) { // This will catch any other exceptions not caught by the previous catch blocks
            System.out.println("Something went wrong " + e); // parent class of all exceptions
        }

        System.out.println(j);
        System.out.println("Code after exception handling");
    }
}

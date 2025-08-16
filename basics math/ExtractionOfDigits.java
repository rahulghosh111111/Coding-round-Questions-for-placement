public class ExtractionOfDigits{
    public static void main(String[] args) {
        int n = 3489;
        int count = 0;
        while(n>0){
            int lastDigit = n%10;
            count++;
            n = n/10;
            System.out.print(lastDigit);

        }
        System.out.println();
        System.out.println(count);
    }
}
public class NumberChangingPyramidPattern {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        for(int i = 1; i<= n ; i++){
        
        for(int j = 1; j<= i; j++){
            System.out.print(num + " ");
            num ++;
        }
        for(int j = i; j<= n-i; j++){
            System.out.print(" ");
        }
        System.out.println();
       } 
    }
}

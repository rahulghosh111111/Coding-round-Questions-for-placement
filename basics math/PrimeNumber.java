public class PrimeNumber {
    public static void main(String[] args) {
        int n=13;
        int cnt= 0;
        for(int i = 1; i*i <= n ; i++){
            if(n % i == 0){
                cnt++;
                if((n/i) != i){
                    cnt++;
                }
            }
        }
        if(cnt == 2 ){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

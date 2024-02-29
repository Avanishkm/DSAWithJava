package string;

public class primeNum {
    public static void main(String[] args) {
        int n = 9;
        if(isprime(n)){
            System.out.println("prime num");
        }else{
            System.out.println("not prime");
        }
    }

    private static boolean isprime(int n){
        if(n <= 1){
            return false;

        }
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

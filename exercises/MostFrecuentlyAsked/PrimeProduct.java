class PrimeProduct{

    public static void main(String [] args){
        System.out.println(isPrimeProduct(22)); // 1
        System.out.println(isPrimeProduct(40)); // 0
        System.out.println(isPrimeProduct(36)); // 0
        System.out.println(isPrimeProduct(25)); // 1
    }

    static int isPrimeProduct(int n){

        int k = 2;

        while( k < n){
            if( n % k == 0 && n % (n / k) == 0){
                if((isPrime(n/k)) == 1 && (isPrime(n/(n/k))) == 1)
                    return 1;
                }
            k++;
        }
        return 0;
    }

    static int isPrime(int m){
        int flagPrime =  0;
        int d = 2;

        if(m == 2)
            return 1;

        while(d < m){
            if(m % d == 0)
                return 0;        
            else
                flagPrime = 1;
            d++;
        }
        return flagPrime;
    }
}
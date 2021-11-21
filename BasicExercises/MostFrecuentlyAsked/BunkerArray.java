class BunkerArray{
    public static void main(String [] args){

        int a [] = {7, 6, 10, 1}; // 1
        int b [] = {7, 6, 10};    // 0
        int c [] = {6, 10, 1};    // 0
 
        System.out.println(isBunker(a));
        System.out.println(isBunker(b));
        System.out.println(isBunker(c));

    }

    static int isBunker(int [] a) {

        boolean isPrime = false; 
        boolean is_one = false;

        for(int i = 0; i < a.length; i++){

            if(isPrime(a[i]) == true)
                isPrime = true;
            else{
                if (a[i] == 1)
                    is_one = true;
            }

            if(is_one == true && isPrime == true)
                return 1;         
        }
        return 0;
    }

    static boolean isPrime(int n){

        int d = 2;

        if(n == 1)
            return false;

        while(d < n){
            if (n % d == 0)
                return false;
            d++;
        }
        return true;
    }

}
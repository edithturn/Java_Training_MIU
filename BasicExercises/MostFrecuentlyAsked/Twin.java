class Twin{
    public static void main(String [] args){

        int a [] = {3, 5, 8, 10, 27};
        int b [] = {11, 9, 12, 13, 23};
        int c [] = {5, 3, 14, 7, 18, 67};
        int d [] = {13, 14, 15, 3, 5};
        int e [] = {1, 17, 8, 25, 67};

        System.out.println(isTwin(a)); // 1
        System.out.println(isTwin(b)); // 1
        System.out.println(isTwin(c)); // 1
        System.out.println(isTwin(d)); // 0
        System.out.println(isTwin(e)); // 0

    }

    static int isTwin(int[ ] a) {
        
        int target = 0;
        int flag = 0;

        for(int i = 0; i < a.length; i++){
            if(isPrime(a[i]) == 1){
                for(int j = 0; j < a.length; j++){
                    if(a[i] + 2 == a[j] && isPrime(a[j]) == 1)
                        return 1;
                }
                if(flag == 0)
                    return 0;
            }            
        }
        return 0;
    }

    static int isPrime(int n){
        int candidate = 2;
        if(n == 2)
            return 1;
        
        while(candidate < n){
            if(n % candidate == 0)
                return 0;
            candidate++;            
        }
        return 1;
    }
}
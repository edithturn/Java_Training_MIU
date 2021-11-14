class  FactorEqual{
    public static void main(String [] args){

        System.out.println(factorEqual(10, 33)); //1
        System.out.println(factorEqual(9, 10));  //0



    }
    
    static int factorEqual(int n, int m){

        int candidate = 1;
        int s_count = 0;
        int f_count = 0;

        while(candidate < n){
            if(n % candidate == 0)
                f_count++;
            candidate++;
        }
        
        candidate = 1;
        while(candidate < m){
            if(m % candidate == 0)
                s_count++;
            candidate++;
        }

        if(f_count == s_count)
            return 1;
        return 0;
    }
}
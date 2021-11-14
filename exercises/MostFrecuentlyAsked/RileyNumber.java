class  RileyNumber{

    public static void main(String [] args){
        
        System.out.println(isRiley(2426)); // 1
        System.out.println(isRiley(3224)); // 0
        System.out.println(isRiley(2222)); // 1
        System.out.println(isRiley(5));    // 0
    }

    static  int isRiley (int n){

        while( n > 0){
            if((n%10)%2 == 0)
                n = n /10;
            else 
                return 0;
        }
        return 1;
    }

}
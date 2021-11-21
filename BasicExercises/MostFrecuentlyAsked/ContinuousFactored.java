class ContinuousFactored{
    public static void main(String [] args){

        System.out.println(isContinuousFactored(6));   // 1
        System.out.println(isContinuousFactored(60));  // 1
        System.out.println(isContinuousFactored(120)); // 1
        System.out.println(isContinuousFactored(90));  // 1
        System.out.println(isContinuousFactored(99));  // 0
        System.out.println(isContinuousFactored(121)); // 0
        System.out.println(isContinuousFactored(2));   // 0
        System.out.println(isContinuousFactored(13));  // 0

    }
    static int isContinuousFactored(int n){

        // Find factors
        int factor = 1;
        int candidate = 2;
        int flag = 0;
        int result = 1;

        while(candidate < n){
            if(n % candidate == 0 && (factor + 1) == (n / (n /candidate))){
                factor = candidate;
                flag = 1;
                result = result*factor;
                if(result == candidate)
                    return 1;
            }
            else
                return 0;
            candidate++;
        }
        
        return flag;
    }   
}

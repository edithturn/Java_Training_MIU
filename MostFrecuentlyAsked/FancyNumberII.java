class FancyNumberII{

    public static void main(String [] args){

        System.out.println(isFancy(5));  // 1
        System.out.println(isFancy(1));  // 1
        System.out.println(isFancy(17)); // 1
        System.out.println(isFancy(61)); // 1
        System.out.println(isFancy(60)); // 0
        System.out.println(isFancy(10)); // 0
    }


    static int isFancy(int n){

        int first = 1;
        int second = 1;
        int sum = 0;

        if(n == 1)
            return 1;

        while(sum <= n){
            sum = 3*first + 2*second;
            second = first;
            first = sum;
            if(sum == n)
                return 1;            
        }
    return 0;
    }
}
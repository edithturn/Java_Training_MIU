class GetExponent{

    public static void main(String [] args){

        System.out.println(getExponent(162, 3)); //4
        System.out.println(getExponent(27, 3));  //3
        System.out.println(getExponent(28, 3));  //0
        System.out.println(getExponent(280, 7)); //1
        System.out.println(getExponent(-250, 5));//3
        System.out.println(getExponent(18, 1));  //-1
        System.out.println(getExponent(128, 4)); //3
    }

    static  int getExponent(int n, int p){

        int num = 1;
        int max = 0;
        int count = 0;
        

        if(n < 0)
            n = n*-1;

        if(p <= 1)
            return -1;

        while(num <= n){
            num = num * p;
            count++; 
            if(n % num == 0)
                max = count;
            if(num * p > n)
                break;
                 
        }
        return max;
    }
}


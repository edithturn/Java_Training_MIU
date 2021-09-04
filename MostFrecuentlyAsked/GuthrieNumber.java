class GuthrieNumber{

    public static void main(String [] args){

        System.out.println(isGuthrie(6));  // 16
        System.out.println(isGuthrie(11)); // 1
        System.out.println(isGuthrie(22)); // 1
        System.out.println(isGuthrie(8));  // 0

    }


    static  int isGuthrie (int n){

        int iter = 0;
        int sum = 1;

        while(iter < n){
            sum = iter + sum;
            iter++;
            if(sum == n)
                return 1;
        }

        return 0;
    }

}
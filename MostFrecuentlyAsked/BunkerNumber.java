class BunkerNumber{


    public static void main(String [] args){


        System.out.println(isBunker(11)); // 1
        System.out.println(isBunker(22)); // 1
        System.out.println(isBunker(8));  // 0

    }
    static  int isBunker (int n){

        int iter = 0;
        int sum = 1;

        while(iter < n){
            sum = iter + sum; // 1 , 1+1, 2+2, 4+3
            if(sum == n)
                return 1;
            iter++;
        }
        return 0;
    }

}
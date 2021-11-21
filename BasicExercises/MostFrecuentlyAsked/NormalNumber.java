class NormalNumber{

    public static void main(String [] args){

        System.out.println(isNormal(1)); // 1
        System.out.println(isNormal(2)); // 1
        System.out.println(isNormal(3)); // 1
        System.out.println(isNormal(4)); // 1
        System.out.println(isNormal(5)); // 1
        System.out.println(isNormal(7)); // 1
        System.out.println(isNormal(8)); // 1
        System.out.println(isNormal(6)); // 0
        System.out.println(isNormal(9)); // 0
        System.out.println(isNormal(10)); // 0
    }

    static int isNormal(int n){
        
        int iter = 2;
        
        while(iter < n){  // 4 -> 4 2 1
            if(n % iter == 0)
                if(iter % 2 > 0)
                    return 0;
            iter++;
        }
        return 1;
    }


}
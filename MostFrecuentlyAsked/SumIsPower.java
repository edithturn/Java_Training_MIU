class NiceArray{
    public static void main(String [] args){
        
        int a [] = {8,8,8,8};
        int b [] = {8,8,8};
        int c [] = {4,4,4};
        int d [] = {2,2,2,2,2,2,2,2};

        System.out.println(sumIsPower(a)); // true
        System.out.println(sumIsPower(b)); // false
        System.out.println(sumIsPower(c)); // false
        System.out.println(sumIsPower(d)); // true

    }

    static boolean sumIsPower(int[] arr) {

        int sum = 0;

        for(int i : arr){
            sum = sum + i;
        }

        int total = 1;

        while(total <= sum){
            total = total * 2;
            if(total == sum)
                return true;
        }
    return false;
    }
}
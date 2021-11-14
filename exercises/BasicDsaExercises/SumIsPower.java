public class SumIsPower{

    public static void main(String [] args){
        int a [] = {8,8,8,8};
        int b [] = {8,8,8};
        int c [] = {4,4,4};

        System.out.println(sumIsPower(a));
        System.out.println(sumIsPower(b));
        System.out.println(sumIsPower(c));

    }

    static boolean sumIsPower(int[] arr) {
        /*
        Calculate the sum and then search for the number  by the result of two multiplied by two as many times is equal to sum.
        */
        
        int sum = 0;
        int ans = 1; 
        
        for(int i: arr ){
            sum += i;
        }

        while(ans <= sum){
            ans = ans * 2;
            if(ans == sum)
                return true;
        }
        return false;    
    }    
}
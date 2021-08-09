public class HasKSmallFactors{

    public static void main(String [] args){

        System.out.println(hasKSmallFactors(7, 30)); // true
        System.out.println(hasKSmallFactors(6, 14)); // false
        System.out.println(hasKSmallFactors(6, 30)); // false
        System.out.println(hasKSmallFactors(10, 20)); // true


    }


    static boolean hasKSmallFactors(int k, int n) {
        int t = 1;

        while( t < k){
            if(n % t == 0){
                if(n / t < k)
                    return true;
            }
            t++;
        }
        return false;
    }
}
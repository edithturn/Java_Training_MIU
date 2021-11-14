public class HasKSmallFactors{

    public static void main(String [] args){

        System.out.println(hasKSmallFactors(7, 30)); // true
        System.out.println(hasKSmallFactors(6, 14)); // false
        System.out.println(hasKSmallFactors(6, 30)); // false
        System.out.println(hasKSmallFactors(10, 20)); // true


    }


    static boolean hasKSmallFactors(int k, int n) {

        int num = 2;

        while(num < n){
            if( n % num == 0 && n/num < k){
                if(num < k)
                    return true;
            }
            num++;

        }
        return false;
     
    }
}
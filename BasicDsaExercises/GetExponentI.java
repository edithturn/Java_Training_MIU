// getExponent(162, 3) returns 4 because 162 = 2^1 * 3^4 , therefore the value of x here is 4.

// => 162 3 | 3^1 = 3
//            3^2 = 9
//            3^3 = 27
//            3^4 = 81
//            3^5 = 243

// => 28 3 | 3^1 = 3
//           3^2 = 9
//           3^3 = 27


public class GetExponentI{

    public static void main(String [] args){

        System.out.println(getExponent(162, 3)); //4
        System.out.println(getExponent(27, 3));  //3
        System.out.println(getExponent(28, 3));  //0
        System.out.println(getExponent(280, 7)); //1
        System.out.println(getExponent(-250, 5));//3
        System.out.println(getExponent(18, 1));  //-1
        System.out.println(getExponent(128, 4)); //3

    }

    static int getExponent(int n, int p){
        int res = p;
        int expo = 1;

        if(p <= 1)
            return -1;
        if (n < 0)
            n = n*(-1);

        while(res <= n){
            res = res*p;
            expo += 1;
            if (res*p > n){
                if (n % res == 0)
                    return expo;
                else
                    break;
            }            
        }
        if (n % p == 0)
            return 1;
        else if ( n % 1 == 0 )
            return 0;
    return expo;
    }    
}
public class FactorTwoCount{

    public static void main(String [] args){
    
        int n1 = 48;
        int n2 = 27;

        System.out.println(factorTwoCount(n1));
        System.out.println(factorTwoCount(n2));
    }

static int factorTwoCount(int n){
    /*
        Checking if the number is divisible by 2, if it is then increase counter, 
        and use the result of the division by 2 as an input to be evaluated if it is divisible by two again.
    */

    int count = 0;

    while( n % 2 == 0 ){
        count += 1;
        n = n/2;
    }
    return count;
    }
}
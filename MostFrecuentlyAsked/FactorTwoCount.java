class FactorTwoCount{

    public static void main(String [] args){

        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
        System.out.println(factorTwoCount(4));
    }

    static int factorTwoCount(int n){

        int count = 0;
        int d = 0;

        while(n % 2 == 0){
            d = n / 2;
            n = d;
            count++;
        }
        return count;
    }
}
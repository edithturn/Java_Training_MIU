class CountDigit{
    public static void main(String [] args){

        System.out.println(countDigit(32121,1));
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));

    }

    static int countDigit(int n, int digit){

        int count = 0;
        
        if(digit < 0)
            return -1;

        while(n > 0){
            if (n%10 == digit)
                count++;
            n = n/10;
        }
    return count;
    }

}
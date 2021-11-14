class Fibonacci{

    public static void main(String [] args){

        System.out.println(isFibonacci(3));  // 1
        System.out.println(isFibonacci(5));  // 1
        System.out.println(isFibonacci(8));  // 1
        System.out.println(isFibonacci(13)); // 1
        System.out.println(isFibonacci(21)); // 1
        System.out.println(isFibonacci(10)); // 0
        System.out.println(isFibonacci(11)); // 0
        System.out.println(isFibonacci(1));  // 1
        System.out.println(isFibonacci(2));  // 1
        


    }

    static int isFibonacci(int n){

        int first = 1;
        int second = 1;
        int sum = 0;

        if(n == 1)
            return 1;

        while(first <= n){
            sum = first + second; // 1+1, 1+2, 2 + 3, 3+5
            first = second; // 1, 2, 3
            second = sum; // 2, 3, 5

            if(sum == n)
                return 1;
        }
        return 0;
    }

}
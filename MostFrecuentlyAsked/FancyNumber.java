class FancyNumber{

    public static void main(String [] args){

        System.out.println(isFancy(17)); // 1
		System.out.println(isFancy(61)); // 1
		System.out.println(isFancy(1));  // 1
		System.out.println(isFancy(10)); // 0
		System.out.println(isFancy(5));  // 1

    }

    static  int isFancy(int n){

        int num = 0;
        int first = 1;
        int previous = 1;
        if(n == 1)
            return 1;
        while(num < n){
            num = 3*previous + 2*first;
            if (num == n)
                return 1;
            first = previous;
            previous = num;
        }

       return 0;
    }

}
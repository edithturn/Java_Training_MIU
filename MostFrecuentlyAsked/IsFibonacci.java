public class IsFibonacci{

    public static void main( String [] args){

               
        System.out.println(isFibonacci(3));  // 1
        System.out.println(isFibonacci(4));  // 0
		System.out.println(isFibonacci(5));  // 1
		System.out.println(isFibonacci(13)); // 1
        System.out.println(isFibonacci(1));  // 1
		System.out.println(isFibonacci(3));  // 1
		System.out.println(isFibonacci(9));  // 0
    }

    static int isFibonacci(int n){

        int num = 2;
        int previous = 1;
        int first = 1;
        if(n == 1)
            return 1;
        
        while(num < n){            
            num = previous + first;
                                    
            if (num == n) 
                return 1;
            first = previous;
            previous = num;
        }

        return 0;

}
}
 
public class BunkerArray{
    public static void main(String [] args ){

        int [] a =  {4, 9, 6, 7, 3}; // return  1
        int [] b =  {4, 9, 6, 15, 21}; // return  0

  
        
        System.out.println(isBunkerArray(a));
        System.out.println(isBunkerArray(b));

    }

     static int isBunkerArray(int [ ] a) {

         for(int i=0; i < a.length - 1; i++){
             if(isOdd(a[i]) == true){
                 if(isPrime(a[i + 1]) == true)
                    return 1;
             }
         }
         return 0;
     }

     static boolean isPrime(int n){
         int count = 2;
         int flag = 0;

         if(n < 1)
            return false;

         while(count <= n/2){
             if(n % count == 0){
                 flag = 1;
                 break;
             }
             count ++;
         }
         
        if(flag == 1)
            return false;
        else
            return true;          
    }

    static boolean isOdd(int n){
        if(n % 2 != 0)
            return true;
        else
            return false;
    }
}
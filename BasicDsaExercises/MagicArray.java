// Problem 02

public class MagicArray{

    public static void main(String [] args){

        int [] arr1 = {21, 3, 7, 9, 11, 4, 6}; // res = 21 , return 1
        int [] arr2 = {13, 4, 4, 4, 4};  // res = 13 , return 1
        int [] arr3 = {10, 5, 5};  // res = 10 , return 1
        int [] arr4 = {0, 6, 8, 20};  // res = 0 , return 0 -> sum of primes is zero, and it is equeal to the first element in the arrat, it shoudl be return 1
        int [] arr5 = {3};
        int [] arr6 = {8, 5, -5, 5, 3};

        System.out.println(isMagicArray(arr1));
        System.out.println(isMagicArray(arr2));
        System.out.println(isMagicArray(arr3));
        System.out.println(isMagicArray(arr4));
        System.out.println(isMagicArray(arr5));
        System.out.println(isMagicArray(arr6));
    }
    static int isMagicArray (int[] a) {
        
        int firstElement = a[0];
        int sum = 0;   
        for(int i=0; i < a.length; i++ ){
            if (isPrime(a[i]) == true){
                sum += a[i];
            }
        }
        if (firstElement == sum){
            return 1;
        }
        else{
            return 0;
        }
    }
    static boolean isPrime(int n){
        
        int counter = 2;
        boolean flag = true;

        if(n == 0 || n == 1 || n < 0)
            return false;

        while(counter <= n / 2){
            if(n % counter == 0){
                flag = false;
                break;
            }
            counter += 1;
        }
        return flag;
    }
}
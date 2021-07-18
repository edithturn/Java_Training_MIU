// Problem 02

public class MagicArray{

    public static void main(String [] args){

        int [] arr1 = {21, 3, 7, 9, 11, 4, 6};
        int [] arr2 = {13, 4, 4, 4, 4};
        int [] arr3 = {10, 5, 5};
        int [] arr4 = {0, 6, 8, 20};
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
        int r = 0;

        r = n/2;

        if(n == 0 || n == 1 || n < 0){
            return false;
        }else{
            for(int i = 2; i < n; i++){
                if (n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
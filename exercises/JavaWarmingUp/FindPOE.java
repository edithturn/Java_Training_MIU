public class FindPOE{

    public static void main(String[] arg){
         int [] arr1 = {1, 8, 3, 7, 10, 2};
         int [] arr2 = {1, 5, 3, 1, 1, 1, 1, 1, 1};
         int [] arr3 = {2, 1, 1, 1, 2, 1, 7};
         int [] arr4 = {1, 2, 3};
         int [] arr5 = {3, 4, 5, 10};
         int [] arr6 = {1, 2, 10, 3, 4};

         System.out.println(f(arr1)); 
         System.out.println(f(arr2)); 
         System.out.println(f(arr3)); 
         System.out.println(f(arr4)); 
         System.out.println(f(arr5));
         System.out.println(f(arr6));
    }
    public static int f(int[] a){
       
        int i = 0;
        int j = a.length - 1;
        int left = a[i];
        int right = a[j];
        int POE = 0;
        
        for (int k = 1; k < a.length - 2; k++){
            if (left < right){
                i++;
                left = left + a[i];
                POE = i + 1;
            }
            else{
                j--;
                right = right + a[j];
                POE = j - 1;
            }
        }
        if (right == left)
            return POE;
        else
            return -1;
    }
}
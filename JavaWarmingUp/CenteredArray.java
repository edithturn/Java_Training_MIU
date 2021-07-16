// Question Number 04

public class WhileLoops{

    /* Solution
    - Check lengh , if length is odd number
    - If length is zero return 0
    - If length is one retutn 1
    - Is length is not odd elements return 0
    - It is odd number of elements, storage the middle.
        - Iterate all the numbers except the idex of the middle
        - If all the numbers are grather than middle return One (iterate until the end)
        - If a number is less than middle return Zero and skip
    */
    public static void main(String[] arg){

        int[] arr0 = {1, 2, 3, 4, 5};
        int[] arr1 = {3, 2, 1, 4, 5};
        int[] arr2 = {3, 2, 1, 4, 1};
        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {};
        int[] arr5 = {10};

        System.out.println(func(arr0)); 
        System.out.println(func(arr1));
        System.out.println(func(arr2));
        System.out.println(func(arr3));
        System.out.println(func(arr4));
        System.out.println(func(arr5));
    
    }
    public static int  func(int[] arr){        
        
        if (arr.length == 0){            
            return 0;
        }
        if (arr.length == 1){
            return 1;
        }

       if (arr.length % 2 == 1){
            int middle = arr[arr.length / 2];

            for(int i=0; i < arr.length; i++){
                if (arr[i] <= middle & i != arr.length / 2){
                    return 0;
                }
            }
        } 
        else{
            return 0;
        } 
        return 1;   
    }
}
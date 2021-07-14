/*Problem
An array with an odd number of elements is said to be centered 
if all elements (except the middle one) are strictly greater than
the value of the middle element. Note that only arrays with an odd number of
elements have a middle element. Write a function that accepts an integer array 
and returns 1 if it is a centered array, otherwise it returns 0.

Examples:
if the input array is	return
{1, 2, 3, 4, 5}	0 (the middle element 3 is not strictly less than all other elements)
{3, 2, 1, 4, 5}	1 (the middle element 1 is strictly less than all other elements)
{3, 2, 1, 4, 1}	0 (the middle element 1 is not strictly less than all other elements)
{1, 2, 3, 4}	0 (no middle element)
{}	0 (no middle element)
{10}	1 (the middle element 10 is strictly less than all other elements)
*/

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
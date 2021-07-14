// Write a function that takes an array of integers as an argument
// and returns a value based on the sums of the even and odd numbers
// in the array. Let X = the sum of the odd numbers in the array and let
// Y = the sum of the even numbers. The function should return X – Y

public class SumOddAndEven{
    public static void main(String[] args){
        int[] arr1 = {3,2,1,2,3,2};
        int[] arr2 = {2,2,3,4,4,0};
        int[] arr3 = {1,4};

        System.out.println(sumOddOrEven(arr1));
        System.out.println(sumOddOrEven(arr2));
        System.out.println(sumOddOrEven(arr3));
    }

    static int sumOddOrEven(int[] arr){
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                evenSum = evenSum + arr[i];
            }
            else{
                oddSum = oddSum + arr[i];
            }
        }
        return oddSum - evenSum;
        }
}
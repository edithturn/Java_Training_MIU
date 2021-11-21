//Question Number 02

public class SumOddAndEven{

    public static void main(String[] args){
        
        int[] arr1 = {1};
        int[] arr2 = {1,2};
        int[] arr3 = {1,2,3};
        int[] arr4 = {1,2,3,4};
        int[] arr5 = {3,3,4,4};
        int[] arr6 = {3,2,3,4};
        int[] arr7 = {4,1,2,3};
        int[] arr8 = {1,1};
        int[] arr9 = {};

        System.out.println(sumOddOrEven(arr1));
        System.out.println(sumOddOrEven(arr2));
        System.out.println(sumOddOrEven(arr3));
        System.out.println(sumOddOrEven(arr4));
        System.out.println(sumOddOrEven(arr5));
        System.out.println(sumOddOrEven(arr6));
        System.out.println(sumOddOrEven(arr7));
        System.out.println(sumOddOrEven(arr8));
        System.out.println(sumOddOrEven(arr9));
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
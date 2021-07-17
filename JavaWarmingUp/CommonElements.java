// Write a function to return an array containing all elements common 
// to two given arrays containing distinct positive integers. You should not use any inbuilt methods. 
// You are allowed to use any number of arrays.
// The signature of the function is:
// int[] f(int[] first, int[] second)

import java.util.Arrays;

public class CommonElements{

    public static void main(String[] args){

        int [] a1 = {1, 8, 3, 2};
        int [] a2 =  {4, 2, 6, 1};

        int [] a3 = {1, 8, 3, 2, 6};
        int [] a4 = {2, 6, 1};

        int [] a5 = {1, 3, 7, 9};
        int [] a6 = {7, 1, 9, 3};

        int [] a7 = {1, 2};
        int [] a8 = {3, 4};

        int [] a9 = {};
        int [] a10 = {1, 2, 3};

        int [] a11 = {1, 2};
        int [] a12 = {};

        int [] a13 = {1, 2};
        int [] a14 = null;

        int [] a15 = null;
        int [] a16 = {};

        int [] a17 = null;
        int [] a18 = null;


        System.out.println(Arrays.toString(f(a1, a2)));
        System.out.println(Arrays.toString(f(a3, a4)));
        System.out.println(Arrays.toString(f(a5, a6)));
        System.out.println(Arrays.toString(f(a7, a8)));
        System.out.println(Arrays.toString(f(a9, a10)));
        System.out.println(Arrays.toString(f(a11, a12)));
        System.out.println(Arrays.toString(f(a13, a14)));
        System.out.println(Arrays.toString(f(a15, a16)));
        System.out.println(Arrays.toString(f(a17, a18)));

    }

    public static int[] f(int[] first, int[] second){

        if (first == null || second == null){
            return null;
        }

        int fLen = first.length;
        int sLen = second.length;
        int min;

       
        if(fLen < sLen){
            min = fLen;
        }
        else{
            min = sLen;
        }

        int[] duplicates =  new int[min];
        int index = 0;

        for(int i=0; i < first.length; i++){

            for( int j=0; j< second.length; j++){

                if(first[i] == second[j]){
                    duplicates[index] = first[i];
                    index = index + 1;
                }
            }
        }
        int [] finalArray = new int[index];

        for(int k = 0; k < index; k++){
            finalArray[k] = duplicates[k];
        }

        return finalArray;
    }
}
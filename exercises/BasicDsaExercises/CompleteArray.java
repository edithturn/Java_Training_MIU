// Question 03

import java.util.Arrays;

public class ArrayIsComplete{
    public static void  main(String [] args){
        int [] a1 = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
        int [] a2 = {5, 7, 9, 13};
        int [] a3 = {2, 6, 3, 4};

        System.out.println(isComplete(a1)); // It is complete
        System.out.println(isComplete(a2)); // It is not complete
        System.out.println(isComplete(a3)); // It is not complete


    }
    static int isComplete(int [] a1){
        int flag = 3;

        if (evenCondition(a1) == 0){
            flag = flag - 1;
            System.out.println("evenCondition" + flag);
        }

        if (compareMinMax((gettingMinMax(a1))) == 0){
            flag = flag - 1;
            System.out.println("compareMinMax" + flag);
        }
        if (allNumberInArray(a1, gettingMinMax(a1)) == 0){
            flag = flag - 1;
            System.out.println("allNumberInArray" + flag);
        }

        if (flag < 3){
            return 0;
        }
        else{
            return 1;
        }
    }
    static int evenCondition(int[] a){

        int evenCount = 0;

        for(int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0)
                if (evenCount >= 2)
                    return 1;
                evenCount += 1;                            
        }
        return 0;
    } 
    static int [] gettingMinMax(int [] a){

        int minmax[] = new int[2];
        int min = 0;
        int max = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] > 0){
                min = a[i];
                max = a[i];
                break;
            }
        }
        for(int i = 1; i < a.length; i++){

            if (a[i] % 2 == 0 && a[i] > 0){
  
                if (min > a[i]){
                    min = a[i];
                }
                if (max < a[i]){
                    max = a[i];
                }
            }
        }
        minmax[0]= min;
        minmax[1]= max;
        System.out.println(Arrays.toString(minmax));
        return minmax;
    }
    static int compareMinMax(int[] a){
        if (a[0] == a[1]){
            return 0;
        }
        else{
            return 1;
        }
    }
    static int allNumberInArray(int[]a, int b[]){ 
        System.out.println(Arrays.toString(b));

        int complete [] = new int[b[1] - b[0] + 1];
        int count = 0;
        int flag = 0;
        for (int i = b[0]; i <= b[1]; i++){
            complete[count] = i;
            count += 1;                                
        }
        System.out.println(Arrays.toString(complete)); 

        for (int i = 0; i < complete.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[j] > 0){
                    if ( complete[i] == a[j]){
                        flag = 1;
                        break;
                    }
                    else{
                        flag = 0;
                    }
                }
            }
            if (flag == 0){
                return 0;
            }       
        }
     return 1;
    }
 
}
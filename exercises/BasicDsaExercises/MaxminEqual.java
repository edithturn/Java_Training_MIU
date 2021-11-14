
// Problem : MaxminEqual
// Solution: Order the array and then check if min and max exist just one time

import java.util.Arrays;

public class MaxminEqual{

    public static void main(String [] args){
        
        int [] a = {11,4,9,11,8,5,4,10};
        int [] b = {};
        int [] c = {2};
        int [] d = {1,1,1,1,1,1};
        int [] e = {2,4,6,7,11};
        int [] f = {-2,-4,-6,-8,-11};
        
        System.out.println(isMaxminEqual(a)); // 1
        System.out.println(isMaxminEqual(b)); // 0
        System.out.println(isMaxminEqual(c)); // 0
        System.out.println(isMaxminEqual(d)); // 0
        System.out.println(isMaxminEqual(e)); // 0
        System.out.println(isMaxminEqual(f)); // 0

    }

    static int isMaxminEqual(int [] a){
        int flag = 0;
        int tmp = 0;
        int count_min = 0;
        int count_max = 0;
        // Ordering the array
        // {11,4,9,11,8,5,4,10}
        // {4,4,8,5,9,10,11,11}
        if (a.length == 0 || a.length == 1 || a[0] == a[a.length  -1 ])
            return 0;
        for(int i = 0; i < a.length; i++){
            for( int j =  i + 1; j < a.length; j++){

                if(a[i] > a[j]){
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }            
        }
        // counting the occurrences of the greatest and least value
        int len=a.length - 1;
        for (int i=1; i < len ; i++){
            if(a[0] == a[i])
                count_min += 1;        
            if(a[len] == a[i]){
                count_max += 1;
        }      
    }
    //If the number of occurrences of the maximum value is equal to that of the minimum value, it returns one
    if (count_min == count_max)
        return 1;
    else
        return 0;
    }
}

// Example 01
// m = 18: 18 9 6 3 2 1 | 6 2 => return 1
// n = 12: 12 6 4 3 2 1 | 6 4 2
// Example 02
// m = 18: 18  9 6 3 2 1  | 18 6 2 => return 0
// n = 32: 32 16 8 4 2 1 | 16 8 4 2

import java.util.Arrays;

public class EvenSubset{

    public static void main(String [] args ){
        int m1 = 18;
        int n1 = 12;

        int m2 = 18;
        int n2 = 32;

        System.out.println(isEvenSubset(m1, n1));
        System.out.println(isEvenSubset(m2, n2));

    }

    static int isEvenSubset(int m , int n){
        /*
        m = [ 6 2 ]
        n = [ 6 4 2 ]
        */
        int a [] = getArray(m);
        int b [] = getArray(n);
        int count = 0;

        for (int i = 0; i < a.length; i ++){
            for (int j = 0; j < b.length; j++){
                if (a[i] == b[j]){
                    count += 1;
                }
            }
        }
        if (count == a.length)
            return 1;
        else
            return 0;        
    }
    
    static int [] getArray(int number){

        int length = getCount(number);        
        int valid_factors [] = new int [length];
        int factor = 1;
        int count = 0;
       
        while (factor < number){
            if (number % factor == 0 & factor % 2 == 0){
                valid_factors[count] = factor;
                count += 1;
            }
            factor += 1;
        }
        return valid_factors;

    }

    static int getCount(int number){
        int count = 2;
        int total = 0;

        while (count < number){
            if (number % count == 0 & count % 2 == 0){
                total += 1;
            }
            count += 1;
        }
        return total;

    }
}
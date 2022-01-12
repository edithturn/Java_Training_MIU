/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics02;

/**
 *
 * @author edith
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables declaration
        
        int a = 7,
            b = 7,
            c = 10;
        
        if (a < b || c > 6)
        {
            System.out.println("a > b");
            int d = 5;
        }
        else if (a > b)
            System.out.println("");
        else
            System.out.println("None above");
        
        
        // Switch
        int f  = 50;
        switch(f)
        {
            case 50:
                System.out.println("a is equal to 50");
            case 100:
                System.out.println("a is equal to 100");
            case 150:
                System.out.println("a is equal to 150");
        }
        
        // Conditional expressions
        int x  = 7;
        
        if (7 % 2 == 0)
            System.out.println("even");
        
        String isEven = x % 2 == 00 ? "even" : "odd";
        System.out.println(isEven);
        
        // Arrays
        
        int [] array;
        
        array = new int[3];
        
        array[0] = 70;
        array[1] = 40;
        array[2] = 440;
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        
        int[] array2 = {124, 14, 124, 512, 4};
        System.out.println(array2[0]);
        System.out.println(array2.length - 1);
        
        // Multidimentional arrays
        
        int [][] tab = new int[4][3];
        tab[2][1] = 99;
        
        System.out.println(tab[2][1]);
        
        int[][] tab2 = 
        {
            {123, 343 -3},
            {23, 4, -2},
            {12, 3, 5154},
            {0, 3, 54},
        };
        
        System.out.println(tab2[3][1]);
        
    }
        

               
}
    
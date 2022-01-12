/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics01;

/**
 *
 * @author edith
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables declaration
        int a = 10;
        long b = 1241241127;
        short c = 12;
        char character = 'A';
        float d = 124.45f;
        double e = 124.45;
        
        // Constant
        String nameAndSurnames = "Hello World!";
        final double NUMBER_PI = 3.14;
       
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(character);
        System.out.println(d);
        System.out.println(e);
        System.err.println(NUMBER_PI);
        System.out.println(nameAndSurnames);
        
        // Casting
        int f =5, g = 2;
        double h = 12, x = 15;
        int result = f /(int)x;
        double result2 = h / x;
        System.out.println(11/5);
        System.out.println(result);
        System.out.println(result2);
        
        // Module operator or Relational Operators
        // Logical Operator: true and false
       // && - conjuctions - AND
       // || - disjunction  - OR
       // Condition statement      

               
    }
    
}

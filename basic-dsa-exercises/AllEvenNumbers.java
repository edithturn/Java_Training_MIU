// An Evens number is an integer whose digits are all even. For example 2426 is an Evens number
// but 3224 is not.
// Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it
// returns 0.
// The function signature is
// int isEvens (int n)

public class WhileLoops{
/*
Solution:
01 Get the last digit, number%10
  01.1 Last digit is even?
    Divide the number with 10 and took the no decimal parts
    Go to step 01
  01.2 Last digit is not even
    return 0
return 1
*/
    public static void main(String[] arg){
        int num1 = 2426;
        int num2 = 3224;
        int num3 = 3204;
        int num4 = 1;
        int num5 = 0;

        System.out.println("Number 2426 is even " + isEvens(num1));    
        System.out.println("Number 3224 is odd  " + isEvens(num2));     
        System.out.println("Number 3204 is odd  " + isEvens(num3));     
        System.out.println("Number 1 is odd     " + isEvens(num4));     
        System.out.println("Number 0 is even    " + isEvens(num5));     
    }
    
    static int isEvens(int n){
        int digit;

        while(n > 0){
            digit = n % 10;
            if (digit % 2 == 0){
                n = n / 10;     
            }             
            else{
                return 0;
            }                
        }
        return 1;
    }    
}
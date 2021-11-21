// Question Number 04

public class RecerseInteger{

    public static void main(String[] args){
        
        int n1 = 1234;
        int n2 = 12005;
        int n3 = 1;
        int n4 = 1000;
        int n5 = 0;
        int n6 = -12345;

        System.out.println(f(n1));
        System.out.println(f(n2));
        System.out.println(f(n3));
        System.out.println(f(n4));
        System.out.println(f(n5));
        System.out.println(f(n6));
        
    }
    public static int f(int n){
        int sign = 0;
        int reverse = 0;

        if (n < 0){
            sign = -1;
            n = n*sign;
        }
        else{
            sign = 1;
        }    
        while(n != 0){
            reverse = (reverse * 10) + n%10;
            n = n/10;
        }
        reverse = reverse*sign;
    return reverse;
    }
}
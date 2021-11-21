import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.event.PrintEvent;

public class Fibonacci {


    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Print number to calculate sequence of fibonacci : ");
        int number = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < number; i++){
           System.out.println("El fibonacci("+i+") es :"  + fibonacci(i));       
        }

    }

    static  int fibonacci(int number){

        if(number < 2)
            return number;
        else
            return fibonacci(number-1) + fibonacci(number - 2);
    }
    
}

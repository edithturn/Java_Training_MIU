import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.event.PrintEvent;

public class FactorialNumber {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type a number : ");
        int number = Integer.parseInt(br.readLine());
        int total = 1;

        while(number < 0){
            System.out.println("ERROR: Number is not positive.");

            System.out.print("Write a number: ");
            number = Integer.parseInt(br.readLine());
        }
        while(number >= 1){
            total *= number;
            number -= 1;
        }
        System.out.println("Factorial of giving number is " + total);    
    }
    
}


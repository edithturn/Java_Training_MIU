import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.StyleConstants;

public class PrimeFunction {

    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type a number between 1 and 1000 ");

        int number = Integer.parseInt(br.readLine());

        Boolean answer = isPrime(number);

        if (answer == true){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }

    static boolean isPrime(int number){

        if (number < 2){
            return false;
        }
        if (number == 2){
            return true;
        }
        else{
            if (number % 2 == 0){
                return false;
            }
        }

        return true;

    }
    
}

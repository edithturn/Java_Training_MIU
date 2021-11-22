import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddNumbers {
    public static void main(String[] args) throws NumberFormatException, IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int number;
        int total_sum;
        String option;

        total_sum = 0;
        
        System.out.println("Would you like to add a number ? y | n ");
        option = br.readLine();

        if (option.equals("n")){
            System.out.println("Bye");    
        }
        else{
            while(option.equals("y")){
                
                System.out.println("Type number : ");
                number = Integer.parseInt(br.readLine());
                total_sum += number;

                System.out.println("Would you like to add a number ? y | n ");
                option = br.readLine();            
            }
            System.out.println("Total sum is : " + total_sum);
        }
    }
}

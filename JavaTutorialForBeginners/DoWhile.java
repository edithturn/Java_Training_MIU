import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhile{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String val;
        int turn = 0;
      
        do
        {
            turn++;
            System.out.println("Current Number :" + turn);

            System.out.println("Do you want to repeat (s|n): ");
            val =  br.readLine();
        }while(val.equals("s"));{

        }

    }
}
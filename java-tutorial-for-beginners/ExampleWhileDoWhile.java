import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleWhileDoWhile{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Do you want to repeat?");

        String val = br.readLine();

        while(val.equals("s")){
            System.out.println("Repitiendo!!");

            System.out.print("Do you want to repeat?");
            val = br.readLine();
        }
    }
}
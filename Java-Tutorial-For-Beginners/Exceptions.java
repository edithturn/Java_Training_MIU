import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

import org.xml.sax.InputSource;

public class ExampleExceptions {

    public static void main(String [] aStrings){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            int a = 5/0;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch(ArithmeticException ex2){
            System.out.println("Disiion with zero is not possible! ");
        }
    }
    
}

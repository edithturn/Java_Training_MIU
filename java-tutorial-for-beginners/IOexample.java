import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOexample{

    public static void main(String[] argrs) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("Name : " + s);
    }

}
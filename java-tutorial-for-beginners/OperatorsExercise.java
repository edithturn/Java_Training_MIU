import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class OperatorsExercise {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();


        double aa = Double.parseDouble(a);
        double bb = Double.parseDouble(b);
        //double c = 2.5;
        //double d = 1.5;

        System.out.println("Integer Values");
        System.out.println(aa+bb);
        System.out.println(aa-bb);
        System.out.println(aa*bb);
        System.out.println(aa/bb);
        System.out.println(aa%bb);

    }
}

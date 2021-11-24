import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Operators {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a, b;
        double x, y;
        System.out.println("Write integer first number : ");
        a = Integer.parseInt(br.readLine());

        System.out.println("Write integer second number : ");
        b = Integer.parseInt(br.readLine());

        System.out.println("Write double first number : ");
        x = Double.parseDouble(br.readLine());

        System.out.println("Write double second number : ");
        y = Double.parseDouble(br.readLine());
        
        System.out.println("=== Calculator Integer ===");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("b - a = " + (b-a));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("b / a = " + (b/a));
        System.out.println("a % b = " + (a%b));
        System.out.println("b % a = " + (b%a));


        System.out.println("=== Calculator Decimals ===");
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("y - x = " + (y-x));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println("y / x = " + (y/x));
        System.out.println("x % y = " + (x%y));
        System.out.println("y % x = " + (y%x));
    }
}

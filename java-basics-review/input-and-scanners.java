import java.util.Scanner;

class InputAndScanners{
    public static void main(String[] args)
    {   

        //int x = 56 % 5;
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();

        int x = Integer.parseInt(scanned);

        System.out.println(scanned);
    }
} 
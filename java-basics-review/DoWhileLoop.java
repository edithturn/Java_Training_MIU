import java.util.Scanner;

class WhileLoops{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            System.out.println("Type a number: ");
            x = sc.nextInt();
        } while( x != 10);
        
    }
}
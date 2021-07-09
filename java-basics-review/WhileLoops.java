import java.util.Scanner;

class WhileLoops{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int x = sc.nextInt();
            int count = 0;

        while(x != 10){
            System.out.println("Type 10...");
            System.out.println("Type a number: ");
            x = sc.nextInt();
            count++;
        }
        System.out.println("You tried" + count + " times");
    }
}
import java.util.Scanner;

class NestedStatement{
    public static void main(String[] args)
    {
        System.out.print("Input your ege: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if(age >= 18){
            System.out.println("Input you fav food: ");
            String food = sc.nextLine();
            if (food.equals("pizza"))
            {
                System.out.println("Mine too");
            }
            else{
                System.out.println("Not mine");
            }
        }
        else if( age >= 13){
            System.out.println("You cannot ride!");
        }
        else{
            System.out.println("You are not a teeneger or an asult");
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  GetTheNumberRight {

    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int guest = 0;
        int target;
        String option;
        target = RandomNumber();

        while(guest != target){

            System.out.println("Do you wanna type a number == >> y | n << ==");
            option = br.readLine();  

            if(option.equals("y")){

                System.out.println("Type a number HERE : ");
                guest = Integer.parseInt(br.readLine());
                
                if (guest < target){
                    System.out.println("Your number is LOWER than target");
                }else if(guest > target){
                    System.out.println("Your number is HIGHER than target");
                }else{
                    System.out.println("CONGRATULATIONS! You WON!, to guest the target number!");
                    break;
                }          
            }else{
                System.out.println("You are really boring due :)");
                break;
            }
              
        }

    }

    public static int RandomNumber(){

        int max = 100;
        int min = 0;
        int number = (int)(Math.random()*(max-min+1) + min);
        
        return number;
    }

}
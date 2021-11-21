import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;


public class ExerciseApprovedSuspended{

    public static void main(String[] args) throws IOException{
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Type a number between 0 and 10");

    int val = Integer.parseInt(br.readLine());

        if(val  >= 0 && val <= 10){
            switch (val) {
                case 5:
                    System.out.println("Aprove");
                    break;
                case 6:
                    System.out.println("Good");
                    break;
                case 7:
                    System.out.println("Better");
                    break;
                case 8:
                    System.out.println("Remarkable");
                    break;
                case 9:
                    System.out.println("outstanding");
                    break;
                case 10:
                    System.out.println("Perfect");
                    break;
                default:
                    System.out.println("Suspended");
                    break;

            }
        }
        else
        System.out.println("Error, write the right number");

    }

}
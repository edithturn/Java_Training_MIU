import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayHourExercise {
    
    public static void main (String[] args) throws NumberFormatException, IOException{
        
        int hour, minutes;
        /*
        00:00 to 07:00 - Early morning
        07:00 to 12:00 - Morning
        12:00 to 21:00 - Afternoon
        21:00 to 00:00 - Night

        12:00 - noon
        00:00 - midnight
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type the hour");

        hour = Integer.parseInt(br.readLine());

        System.out.println("Type the minutes");
        minutes = Integer.parseInt(br.readLine());

        if(hour == 12 && minutes == 0){
            System.out.print("Noon");
        }else{
            if (hour == 0 && minutes == 0){
                System.out.println("Midnight");
            }else{
                if(hour >= 0 && hour <= 7)
                    System.out.println("Early morning");
                else
                    if(hour > 7 && hour <= 12)
                        System.out.println("Early morning");
                else
                    if(hour > 12 && hour <= 21)
                        System.out.println("Afternoon");
                else
                    if(hour > 21 && hour <= 23)
                        System.out.println("Night");
            }
        }
    }
}



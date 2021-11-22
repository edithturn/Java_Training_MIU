//package LightBulb;

public class LightBulb {

    private boolean state = false;
    
    public void turnOn(){
        state = true;
    }

    public void turnOff(){
        state = false;
    }
    public void checkState(){
        if(state == true)
            System.out.println("Turn ON");
        else
            System.out.println("Turn OFF");
    }
}

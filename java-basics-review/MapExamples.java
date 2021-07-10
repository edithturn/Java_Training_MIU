import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;


public class main{
    public static void main(String[] args){

        Map<Character,Integer> m = new HashMap<Character,Integer>();
        String str = "hello my name is Edith and I am cool";
        int[] y = {-99,3,5,7,2,0};

        // Order from index 2 to 3
        Arrays.sort(y, 2,3);
        for(int i:y)        {
            System.out.println(i + ",");
        }
        // Complete a HashMap with key and value
       for(char x:str.toCharArray()){
            if (m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x, old+1);
            }
            else{
                m.put(x, 1);
            }
       }

       m.remove(' ');

       System.out.println(m);
    }
}
import java.util.HashMap;
import java.util.Map;

public class main{
    public static void main(String[] args){

        Map<String,Integer> m = new HashMap<String,Integer>();
        m.put("edith",5);
        m.put("joe",7);
        m.put("TT",6);

        m.containsValue("b");
        m.containsKey(5);

        m.get(5);

        System.out.println(m.values());
    }
}
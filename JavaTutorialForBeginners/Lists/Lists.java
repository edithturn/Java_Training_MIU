package Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        
        Movie m1 = new Movie();
        Movie m2 = new Movie();

        List<Movie> list;
        list = new ArrayList<Movie>();

        list.add(m1);
        list.add(m2);
    }
    
}

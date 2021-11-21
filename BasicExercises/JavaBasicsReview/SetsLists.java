import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class SetsLists{

    public static void main(String[] args){

        ArrayList<Integer> p = new ArrayList<Integer>();
        Set<Integer> t = new HashSet<Integer>();
        LinkedList<Integer> k = new LinkedList<Integer>();
        t.add(2);
        t.add(4);
        t.add(2);
        t.add(7);
        t.remove(4);
        t.clear();

        p.add(1);
        p.add(2);
        p.get(0);
        p.set(1, 5);


        boolean x = t.contains(5);
        int y = t.size();

        System.out.println("Zise " + y);
        System.out.println(t);
        System.out.println(x);

        System.out.println(p);
    }
}
import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        base("ekaaaaaaaa", 4);
        System.out.println(add2(6));
    }
public static void base(String str, int x){
    for (int i = 0; i < x; i++){
        System.out.println(str);
    }
}
public static int add2(int x){
    return x + 2;
        
    }
}


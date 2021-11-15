public class PrecedenceExample{
    public static void main(String[] main){
        int a = 5;
        int b = 2;
        int c = 3;

        int r = a + b * c;
        System.out.println("Result "  + r);

        r = (a + b) * c;
        System.out.println("Result "  + r);
    }
}
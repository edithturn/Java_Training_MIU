public class isMeera{
    
    public static void main(String[] args){
        int [] a =  {3, 5, -2};
        int [] b =  {8, 3, 4};

        System.out.println(isMeera(a));
        System.out.println(isMeera(b));
    }

    static  int isMeera(int [] a){
        
        int product;

        for (int i : a){
            product = i * 2;
            for (int j : a){
                if (product == j)
                    return 0;
            }
        }
        return 1;
    }
}
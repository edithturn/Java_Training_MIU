import java.util.Arrays;

class Fill{

    public static void main(String [] args){
       
        int [] a = {2, 3, 6, 13};
        int [] b = {2, 3, 5, 11};
        int [] c = {3, 3, 5, 11};
        int [] d = {2, 3, 6, 12, 25};

        System.out.println(isSuper(a)); // 1.
        System.out.println(isSuper(b)); // 0
        System.out.println(isSuper(c)); // 0
        System.out.println(isSuper(d)); // 0


    }

    static int isSuper (int a[]) {
        
        int sum = 0;

        for(int i = 0; i < a.length - 1; i++){

            sum = sum + a[i];

            if(sum >= a[i + 1])
                return 0;
        }
       return 1;
    }
}

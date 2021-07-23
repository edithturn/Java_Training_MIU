// Problem: BalancedArray

public class BalancedArray{

    public static void main(String[] String){

        int [] a = {-2, 2, 2, 2};
        int [] b = {-2, 3, 2, -3};
        int [] c = {-5, 2, -2};

        System.out.println(isBalanced(a));
        System.out.println(isBalanced(b));
        System.out.println(isBalanced(c));
    }

    static int isBalanced (int [] a){  //{-5, 2, -2};

        int flag = 0;

        for (int i = 0; i < a.length; i++){

            int spec = -a[i];

            for (int j = 0; j < a.length; j++){
                if (a[j] == spec){
                    flag = 1;
                    break;
                }
                else{
                    flag = 0;
                }
            }
            if(flag == 0)
                return 0;
        }
        return flag;
    }
}
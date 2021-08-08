public class Twinoid{

    public static void main(String [] args){
        int [] a = {3, 3, 2, 6, 7}; // 1
        int [] b = {3, 3, 2, 6, 4}; // 0
        int [] c = {3, 3, 2, 6, 6, 7};   // 0
        int [] d = {3, 3, 2, 7, 6, 7}; // 0
        int [] e = {3, 8, 5, 7, 3}; // 0
        int [] f = {2, 8, 5, 7, 3}; // 0


        System.out.println(isTwinoid(a));
        System.out.println(isTwinoid(b));
        System.out.println(isTwinoid(c));
        System.out.println(isTwinoid(d));
        System.out.println(isTwinoid(e));
        System.out.println(isTwinoid(f));

    }

    static int isTwinoid (int []  a){

        int flag = 0; //{3, 3, 2, 7, 6, 7};

        for(int i = 0; i < a.length - 1; i++){
            if(flag == 1 & a[i] % 2 == 0){
                if(a[i + 1] % 2 == 0){
                    flag = 0;
                    break;
                }
                else{
                    flag = 1;
                    break;
                }
            }
            else{
                if(a[i] % 2 == 0){
                    flag = 1;
                }
                else if (flag == 1 ){
                    flag = 0;
                    break;
                }
                else
                    flag = 0;

            }
        }
        return flag;
    }
}
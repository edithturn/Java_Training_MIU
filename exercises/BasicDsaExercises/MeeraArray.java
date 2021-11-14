public class MeeraArray{

    public static void main(String [] args){
    
        int [] a = {4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}; // 1
        int [] b = {2, 4, 6, 8, 6};         // 0
        int [] c = {2, 8, 7, 10, -4, 6};    // 0
        int [] d = {2, 8, 4, 9, 4, -4, 6};  // 1

        System.out.println(isMeera(a));
        System.out.println(isMeera(b));
        System.out.println(isMeera(c));
        System.out.println(isMeera(d));

    }

    static  int isMeera (int[] a) {
        /*
         Count left and right value when they are even, if they are equal and the next value is odd return 1.
        */
        int count_right = 0;
        int count_left = 0;
        int ans = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                count_left += 1;
                if (a[a.length - count_left] % 2 == 0){
                    count_right += 1;
                }                
            }
            else {
                if(count_left == count_right & (a[i] % 2 > 0 & a[a.length - count_left - 1] % 2 > 0))
                    return 1;
                else if (count_left != count_right)
                    return 0;               
            }
        }
        return ans;
    }

}

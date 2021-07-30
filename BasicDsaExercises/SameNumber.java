public class SameNumber{
    
    public static void main(String [] args){

        int a [] = {1,2,4,0,0,0,3,4,5};
        int b [] = {1,2,0,0,0,3,4,5};
        int c [] = {1,2,4,9, 0,0,0,3,4, 5};
        int d [] = {1,2, 0,0, 3,4};

        System.out.println(isHollow(a));
        System.out.println(isHollow(b));
        System.out.println(isHollow(c));
        System.out.println(isHollow(d));

    }

    static int isHollow(int[] a){
        /*
        Count numbers at the begining of the array, then counting the zeros and finally counting the last numbers different than zero.
        Comparign the three values.
        */

        int left = 0;
        int zeros = 0;
        int right = 0;
        int ans = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] > 0 || a[i] < 0){
                if(zeros > 0)
                    right += 1;
                else
                    left += 1;
            }
            else if(a[i] == 0){
                zeros += 1;
            }
        }
        if(zeros >= 3 & left == zeros & zeros == right)
            ans = 1;
        else
            ans = 0;
        return ans;
    }
}
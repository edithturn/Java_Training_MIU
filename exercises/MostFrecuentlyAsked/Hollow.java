class Hollow{

    public static void main(String [] args){

        int [] a =  {1,2,4,0,0,0,3,4,5}; // 1
        int [] b =  {1,2,0,0,0,3,4,5};    // 0
        int [] c =  {1,2,4,9, 0,0,0,3,4, 5}; // 0
        int [] d = {1,2, 0,0, 3,4};  // 0
        int [] e = {1,0,1}; // 1 


        System.out.println(isHollow(a));
        System.out.println(isHollow(b));
        System.out.println(isHollow(c));
        System.out.println(isHollow(d));
        System.out.println(isHollow(e));
    }

    static int isHollow(int[] a){
        int left = 0;
        int right = 0;
        int zeros = 0;
        int flag = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] != 0 && flag == 0){
                left++;
                if(a[a.length - left] != 0){
                    right++;
                }        
            }else{
                if(a[i] == 0){
                    flag = 1;
                    zeros++;
                }
            }
        }

        /*System.out.println(left);
        System.out.println(right);
        System.out.println(zeros);*/


        if(left == right && left + right + zeros == a.length)
            return 1;
        else
            return 0;
    }
}


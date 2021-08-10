class BeanArray{
    public static void main(String [] args){

        int [] a = {1, 2, 3, 9, 6, 13};  // 1
        int [] b = {3, 4, 6, 7, 13, 15};  // 1
        int [] c = {1, 2, 3, 4, 10, 11, 12}; // 1
        int [] d = {3, 6, 9, 5, 7, 13, 6, 17} ; // 1
        int [] e = {9, 6, 18};  // 0
        int [] f = {4, 7, 16};  // 0

        System.out.println(isBean(a));
        System.out.println(isBean(b));
        System.out.println(isBean(c));
        System.out.println(isBean(d));
        System.out.println(isBean(e));
        System.out.println(isBean(f));
    }


    static  int isBean (int[] a){
        boolean flag_9 = false;
        boolean flag_13 = false;
        boolean flag_7 = false;
        boolean flag_16 = false;

        for(int i = 0; i < a.length; i++){ //{3, 6, 9, 5, 7, 13, 6, 17} ;

            if(a[i] == 9)
                flag_9 = true;
            if(a[i] == 13)
                flag_13 = true;
            if(a[i] == 7)
                flag_7 = true;
            if(a[i] == 16)
                flag_16 = true;

            if(flag_9 == true && flag_13 == true)
                return 1;
        }

        if( flag_9 == true && flag_13 == true || flag_7 == true && flag_16 == false )
            return 1;
        else if(flag_9 == false && flag_13 == false  && flag_7 == false)
            return 1;
        else
            return 0;
    }
}
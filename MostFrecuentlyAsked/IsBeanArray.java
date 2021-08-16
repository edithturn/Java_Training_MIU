public class IsBeanArray{

    public static  void main(String [] args){
        int a [] = {1, 2, 3, 9, 6, 13};         // 1
        int b [] = {3, 4, 6, 7, 13, 15};        // 1
        int c [] = {1, 2, 3, 4, 10, 11, 12};    //  ??
        int d [] =  {3, 6, 9, 5, 7, 13, 6, 17} ;// 1
        int e [] = { 9, 6, 18}; // 0
        int f [] = {4, 7, 16};  // 0


        System.out.println(isBean(a));
        System.out.println(isBean(b));
        System.out.println(isBean(c));
        System.out.println(isBean(d));
        System.out.println(isBean(e));
        System.out.println(isBean(f));
        

    }

    static int isBean (int[] a){
        boolean is_9 = false;
        boolean is_13 = false;
        boolean is_7 = false;
        boolean is_16 = false;

        for(int i = 0; i < a.length; i++){
            if(a[i] == 9)
                is_9 = true;
            if(is_9 == true && a[i] == 13)
                return 1;
            if(a[i] == 7)
                is_7 = true;
            if(a[i] == 16)
                is_16 = true;
        }

        if(is_7 == true && is_16 == false)
            return 1;
        else
            return 0;
    }
}
class FilterArray{


    public static void main(String [] args){

        int a [] = {1, 2, 3, 9, 6, 11};
        int b [] = {3, 4, 6, 7, 14, 16};
        int c [] = {1, 2, 3, 4, 10, 11, 13};
        int d [] = {3, 6, 5, 5, 13, 6, 13};
        int e [] = {9, 6, 18};
        int f [] = {4, 7, 13};

        System.out.println(isFilter(a)); // 1
        System.out.println(isFilter(b)); // 1
        System.out.println(isFilter(c)); // 1
        System.out.println(isFilter(d)); // 1
        System.out.println(isFilter(e)); // 0
        System.out.println(isFilter(f)); // 0
    }

    static  int isFilter(int[ ] a){

        int is_9 = 0;
        int is_11 = 0;
        int is_7 = 0;
        int is_13 = 0;

        for(int x: a){
            if(x == 9)
                is_9 = 1;
            if(x == 11)
                is_11 = 1;
            if(x == 7)
                is_7 = 1;
            if(x == 13)
                is_13 = 1;
        }

        if(is_9 == 1 && is_11 == 1 || is_7 == 1 && is_13 == 0)
            return 1;
        else if( is_7 == 0 && is_13 == 1)
            return 1;
        else
            return 0;
    }
}
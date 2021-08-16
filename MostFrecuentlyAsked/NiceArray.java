class NiceArray{
    public static void main(String [] args){

        int a [] = {2, 10, 9, 3};
        int b [] = {2, 2, 3, 3, 3};
        int c [] =  {1, 1, 1, 2, 1, 1};
        int d [] = {0, -1, 1};

        int e [] =  {3, 4, 5, 7};


        System.out.println(isNice(a)); //1
        System.out.println(isNice(b)); //1
        System.out.println(isNice(c)); //1
        System.out.println(isNice(d)); //1
        System.out.println(isNice(e)); //0
    }

    static  int isNice(int[ ] a){

        int sub = 0;
        int add = 0;
        boolean flag = false;

        for(int i = 0; i < a.length; i++){

            sub = a[i] - 1;
            add = a[i] + 1;

            for(int j = 0; j < a.length; j++){
                if(a[j] == sub || a[j] == add){
                    flag = true;
                    break;
                }
                else
                    flag = false;
            }
            if (flag == false)
                return 0;
        }
        return 1;

    }
}
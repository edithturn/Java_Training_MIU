class IsSub{

    public static void main(String [] args){

        int a [] =  {13, 6, 3, 2};
        int b [] =  {11, 5, 3, 2};


        System.out.println(isSub(a));
        System.out.println(isSub(b));
    }

    static int isSub (int [] a) {

        int num = 0;
        int sum = 0;
        boolean flag = false;

        for(int i = 0; i < a.length; i++){
            num = a[i];
            for(int j = i + 1; j < a.length; j++)
                sum = sum  + a[j];
            if(num > sum)
                sum = 0;
            else
                return 0;
        }
        return 1;
    }
    
}
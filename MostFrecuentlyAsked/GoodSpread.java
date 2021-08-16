class GoodSpread{

    public static void main(String [] args){

        int a [] =  {2, 1, 2, 5, 2, 1, 5, 9};
        int b [] =  {3, 1, 3 ,1, 3, 5, 5, 3};
        int c [] =  {3, 1, 3 ,1, 3, 5, 5, 1};
        int d [] =  {3, 1};

        System.out.println(goodSpread(a));
        System.out.println(goodSpread(b));
        System.out.println(goodSpread(c));
        System.out.println(goodSpread(d));

        


    }

    static int goodSpread (int[ ] a) {

        int count = 0;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j])
                    count++;        
            }
            if(count > 3)
                return 0;
            else
                count = 0;
        }
        return 1;
    }
}
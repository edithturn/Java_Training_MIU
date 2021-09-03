class Centered{
    public static void main(String [] args){

        int a [] =  {5, 3, 3, 4, 5};
        int b [] = {3, 2, 1, 4, 5};
        int c [] = {3, 2, 1, 4, 1};
        int d [] = {3, 2, 1, 1, 4, 6};
        int e [] = {};
        int f [] = {1};


        System.out.println(isCentered(a)); // 0
        System.out.println(isCentered(b)); // 1
        System.out.println(isCentered(c)); // 0
        System.out.println(isCentered(d)); // 0
        System.out.println(isCentered(e)); // 0
        System.out.println(isCentered(f)); // 1



    }

    static int isCentered(int[ ] a){

        if(a.length == 0)
            return 0;
        if(a.length == 1)
            return 1;

        int middle = a[a.length/2];
        int index_middle = a.length/2;
        int flag = 0;

        //System.out.println( "asd" + middle);
        //System.out.println( "inde " + index_middle);

        for(int i =0; i < a.length; i++){
            if(i != index_middle){
                if(a[i] > middle)
                    flag = 1;
                else
                    return 0;
            }            
        }
        return flag;
    }
}

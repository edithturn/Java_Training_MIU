class MeeraArray{

    public static void main(String [] args){

        int [] a =  {3, 5, -2};  // return 1
        int [] b = {8, 3, 4};    // return 0
        int [] c = {1, 2, 4, 2}; // return 0
        int [] d = {9, 4, 6, 7}; // return 1

        System.out.println(isMeera(a));
        System.out.println(isMeera(b));
        System.out.println(isMeera(c));
        System.out.println(isMeera(d));
    }

    static  int isMeera(int [] a){
        
        int flag = 1;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i]*2 == a[j])
                    return 0;
            }
        }
        return 1;
    }
}
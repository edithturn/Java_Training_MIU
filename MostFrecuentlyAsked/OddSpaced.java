class OddSpaced{

    public static void main(String [] args){

        int a [] = {200, 1, 151, 160} ;
        int b [] = {200, 10, 151, 160};
        int c [] = {100, 19, -131, -140} ;
        int d [] = {80, -56, 11, -81};

        System.out.println(isOddSpaced(a, 4)); // 1
        System.out.println(isOddSpaced(b, 4)); // 0
        System.out.println(isOddSpaced(c, 4)); // 0
        System.out.println(isOddSpaced(d, 4)); // 1
    }

    static int isOddSpaced (int a[], int len){
        
        if(len == 2)
            return 0;
        
        int min = a[0];
        int max = a[1];

        for(int i = 0; i  < len; i++){

            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
        }

        //System.out.println("Min" + min);
        //System.out.println("Max" + max);

        if((max - min)%2 > 0)
            return 1;
        else
            return 0;

     }
}
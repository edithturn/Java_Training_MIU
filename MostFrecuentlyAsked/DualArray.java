class DualArray{
    
    public static void main(String[] args){

        int a [] = {1, 2, 1, 3, 3, 2};
        int b [] = {2, 5, 2, 5, 5};
        int c [] = {3, 1, 1, 2, 2};

        System.out.println(isDual(a)); // 1
        System.out.println(isDual(b)); // 0 
        System.out.println(isDual(c)); // 0


    }

    static int isDual (int[ ] a){

        int count = 0;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j])
                    count++;
            }
            if(count == 2)
                count =0;
            else
                return 0;
        }

        return 1;

    }
}
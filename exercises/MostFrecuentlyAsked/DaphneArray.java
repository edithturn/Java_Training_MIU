class DaphneArray{
    public static void main(String [] args){
        
        int a [] = {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6};
        int b [] = {2, 4, 6, 8, 6};
        int c [] = {2, 1, 6};

        System.out.println(isDaphne(a)); // 1
        System.out.println(isDaphne(b)); // 0
        System.out.println(isDaphne(c)); // 0

        
    }
    static  int isDaphne (int[ ] a){
        
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0 && a[a.length - i - 1] % 2 == 0){
                even = 1;
            }
            else{
                if(a[i] % 2 > 0)
                    odd = 1;
            }
            if(even == 1 && odd == 1)
                return 1;
        }
        return 0;
    }
}
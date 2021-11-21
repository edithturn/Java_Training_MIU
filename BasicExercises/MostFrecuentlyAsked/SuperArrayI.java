class SuperArrayI{
    public static void main(String [] args){

        int a [] = {2,3,6,13};
        int b [] = {2,3,5,11};
        int c [] = {2,3,6,11};
        int d [] = {1,2,4,8};

        System.out.println(isSuper(a)); // 1
        System.out.println(isSuper(b)); // 0
        System.out.println(isSuper(c)); // 0
        System.out.println(isSuper(d)); // 1
    }

    static int isSuper (int [ ] a){

        int sum = 0;

        for(int i = 0; i < a.length - 1; i++){
            sum = sum + a[i]; //2, 2+3
            if(sum >= a[i+1])
                return 0;
        }
        return 1;
    }
}
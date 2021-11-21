class FancyNumberI{
    public static void main(String [] args){

        int a [] = {2, 3, 6, 13};
        int b [] = {2, 3, 5, 11};
        int c [] = {2, 3, 6, 12};

        System.out.println(isSuper(a));
        System.out.println(isSuper(b));
        System.out.println(isSuper(c));

    }

    static  int isSuper (int [ ] a) {

        int sum = a[0];

        for(int i = 1; i < a.length - 1; i++){

            sum = sum + a[i];
            if(sum >= a[i + 1])
                return 0;
        }

        return 1;
    }
}
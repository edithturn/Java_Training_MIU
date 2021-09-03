class SetEqual{
    public static void main(String [] args){
        int a [] = {1, 9, 12};
        int b [] = {12, 1, 9};
        int c [] = {9, 1, 12, 1};
        int d [] = {1,  9, 12, 9, 12, 1, 9};
        int e [] = {1, 7, 8};
        int f [] = {1, 7, 1};
        int g [] = {1, 7, 6};
        int h [] = {1, 7, 8, 9};

        System.out.println(isSetEqual(a, b)); // 1
        System.out.println(isSetEqual(a, c)); // 1
        System.out.println(isSetEqual(a, d)); // 1
        System.out.println(isSetEqual(e, f)); // 0
        System.out.println(isSetEqual(e, g)); // 0
        System.out.println(isSetEqual(e, h)); // 1
        


    }

    static int isSetEqual(int[ ] a, int[ ] b){

        int counter = 0;
        int len = a.length;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    counter++;
                    break;
                }
            }
        }
        if(counter == len)
            return 1;
        return 0;
    }
}
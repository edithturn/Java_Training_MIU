class Paired{

    public static void main(String [] args){

        int a [] = {7, 2, 3, 6, 7};     // 1
        int b [] = {7, 15, 9, 2, 3};    // 0
        int c [] = {17, 6, 2, 4};       // 0

        System.out.println(isPaired(a));
        System.out.println(isPaired(b));
        System.out.println(isPaired(c));

    }
    static int isPaired(int[ ] a){

        for(int i = 0; i < a.length; i++){
            if(i % 2 == 0 && a[i] % 2 == 0){ // even, odd
                return 0;
            }
            if(i % 2 > 0 && a[i] % 2 > 0) // odd, even
                return 0;
        }
        return 1;
    }
}
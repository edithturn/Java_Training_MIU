class PascalNumber{

    public static void main(String [] args){


        System.out.println(isPascal(6));  // 1
        System.out.println(isPascal(15)); // 1
        System.out.println(isPascal(7));  // 0
        System.out.println(isPascal(3));  // 1
        System.out.println(isPascal(4));  // 0
    }

    static  int isPascal (int n) {

        int ite = 1;
        int sum = 0;

        while(ite <= n){
            sum = sum + ite; // 1, 1+2, 3 + 3, 6 + 4
            if(sum == n)
                return 1;
            ite++;
        }
    return 0;

    }
}
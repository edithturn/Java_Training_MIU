class EvenSubset{

    public static void main(String [] args){

        System.out.println(isEvenSubset(18, 12));  //1
        System.out.println(isEvenSubset(18, 9));   //0
        System.out.println(isEvenSubset(6, 8));    //1
        System.out.println(isEvenSubset(18, 32));  //0
        // 18 | 1, 2, 3, 6, 9, 18
        // 12 | 1, 2, 3, 4, 6, 12
        // 9  | 1, 9
        // 6  | 1, 2, 3, 6
        // 8  | 1, 2, 4, 8
        // 32 | 1 2 4 8 16 32
    }

    static int isEvenSubset(int m, int n){

        int tmp = 2;

        while(tmp < m){
            if(m%tmp == 0 && tmp%2 == 0){
                if(n%tmp == 0)
                    tmp++;
                else
                    return 0;
            }
            else
                tmp++;
        }
        return 1;
    }
}
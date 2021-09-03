class SmartNumber{

    public static void main(String [] args){

        System.out.println(isSmart(11)); // 1
        System.out.println(isSmart(22)); // 1
        System.out.println(isSmart(8));  // 0
        System.out.println(isSmart(7));  // 1

    }

    static int isSmart(int n){
        int number = 0;
        int result = 1;

        while(number < n){
            result = result + number;
            if(result == n)
                return 1;
            number++;
        }
        return 0;
    }

}
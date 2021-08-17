import java.util.Arrays;


class MeeraNumber{

    public static void main(String [] args){

        System.out.println(minDistance(6));  // 2 3 -> 1
        System.out.println(minDistance(30)); // 2 5 6 15 -> 1
        System.out.println(minDistance(21)); //  3 7  -> 4
        System.out.println(minDistance(63));  // 3 7 9 21 -> 2
        System.out.println(minDistance(25));  // 5  -> 0
        System.out.println(minDistance(11));  //    -> -1
    }

    static  int minDistance(int n) {
        
        int num = 2;
        int a [] = new int [n/2];
        int count = 0;

        while(num < n){
            if(n % num == 0){
                a[count] = num;
                count++;
            }
            num++;
        }

        int sub = 0;
        int minor = n;

        for(int i = 1; i < a.length; i++){
            if(a[0] == 0)
                return -1;
            if(a[1] == 0)
                return 0;
            if(a[i] == 0)
                break;
            sub = a[i] - a[i - 1];
            if(sub < minor)
                minor = sub;           
        }
        return minor;
    }
    
}
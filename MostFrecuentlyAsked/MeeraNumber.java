import java.util.Arrays;


class MeeraNumber{

    public static void main(String [] args){

        System.out.println(isMeera(6));  // 1
        System.out.println(isMeera(30)); // 1
        System.out.println(isMeera(21)); // 0
        System.out.println(isMeera(2)); // 0
    }

    static int isMeera(int n){

        int [] tmp = new int[n];
        int count = 0;
        
        for(int m = 2; m < n; m++){
            if(n%m == 0){
                tmp[count] = m;
                count++;
            }
        }

        count = 0;
        for(int j = 0; j < tmp.length; j++){
            if(tmp[j] > 0)
                count++;
        }
        for(int k = 0; k < count; k++){
            if(tmp[k] == count)
                return 1;
        }    
    return 0;
    }
}
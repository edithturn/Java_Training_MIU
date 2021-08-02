import java.util.Arrays;

public class IsMaxMinEqual{

    public static void main(String [] args){

        int [] aa = {};
        int [] bb = {2};
        int [] cc = {11, 11, 11 , 11};
        int [] dd = {2,4,6,8,11};
        int [] ee = {-2,-4,-6,-8,-11};

        int [] a =  {11, 4, 9, 11,  8, 5 , 4, 10};
        int [] b =  {11, 4, 9, 11,  8, 11 , 4, 10};
        int [] c =  {11, 4, 9, 11,  8, 4 , 4, 10};
        

        System.out.println(isMaxMinEqual(aa)); // 0
        System.out.println(isMaxMinEqual(bb)); // 0
        System.out.println(isMaxMinEqual(cc)); // 0
        System.out.println(isMaxMinEqual(dd)); // 1
        System.out.println(isMaxMinEqual(ee)); // 1

        System.out.println(isMaxMinEqual(a)); // 1
        System.out.println(isMaxMinEqual(b)); // 0
        System.out.println(isMaxMinEqual(c)); // 0


    }

    static int isMaxMinEqual(int[] a){

        int tmp = 0;
        int left_count = 0;
        int rigth_count = 0;

        if(a.length == 0 || a.length == 1)
            return 0;
       
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[j] > a[i]){
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
                
            }
        }
        if (a[0] == a[a.length - 1])
            return 0;

        int flag = 0;
        int index = 0; //{4, 4, 4 , 8, 9, 10, 11, 11};

        
        for(int k = 0; k < a.length; k++){
            if (a[0] == a[k])
                left_count++;
            if(a[a.length  - 1] == a[k]){
                rigth_count++;                
            }
        }

        if(left_count == rigth_count)
            return 1;
        else
            return 0;
    }

}
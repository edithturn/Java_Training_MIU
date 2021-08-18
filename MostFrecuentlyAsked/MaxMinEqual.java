import java.util.Arrays;

class GoodSpread{

    public static void main(String [] args){

        int[] arr = { 11, 4, 9, 11, 8, 5, 4, 10 };
        int[] arr1 = { 1, 1, 1, 1, 1, 1 };
        int[] arr2 = {};
        int[] arr3 = { -2, -4, -6, -8, -11 };
        int[] arr4 = { 2, 4, 6, 8, 11 };
        int[] arr5 = { 2 };

		System.out.println(isMaxMinEqual(arr)); // 1
		System.out.println(isMaxMinEqual(arr1)); // 0		
		System.out.println(isMaxMinEqual(arr2)); // 0		
		System.out.println(isMaxMinEqual(arr3)); // 1		
		System.out.println(isMaxMinEqual(arr4)); // 1		
		System.out.println(isMaxMinEqual(arr5)); // 0       


    }

    static int isMaxMinEqual(int[ ] a) {

        int tmp = 0;
        int rep = 0;

        if(a.length == 0 || a.length == 1)
            return 0;
        if(a[0] == a[a.length - 1])
            return 0;
        for(int i = 0; i < a.length; i++){
            for(int j =0; j < a.length; j++){
                if(a[j] > a[i]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }              
            }      
        
        }
        //System.out.println(Arrays.toString(a));

        int first = 0;
        int second = 0;

        for(int i  = 0; i < a.length; i++){
            if(a[i] == a[0]){

                first++;
                if(a[a.length - 1 - i] == a[a.length - 1])
                    second++;
            }
        }

        if(first == second)
            return 1;
        else
            return 0;       
    }
}
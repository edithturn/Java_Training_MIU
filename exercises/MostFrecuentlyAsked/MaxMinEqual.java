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

        if(a.length <= 1)
            return 0;

        int higher = a[0];
        int lower = a[1];        
      
        for(int i = 0; i < a.length; i++){
            if(a[i] > higher)
                higher = a[i];
            if(a[i] < lower)
                lower = a[i];
        }
        if(lower == higher)
            return 0;

        int higher_count = 0;
        int lower_count = 0;

        for(int k = 0; k < a.length; k++){
            if(a[k] == higher)
                higher_count++;
            if(a[k] == lower)
                lower_count++;
        }
        if(higher_count == lower_count)
            return 1;
        return 0;
    }
}
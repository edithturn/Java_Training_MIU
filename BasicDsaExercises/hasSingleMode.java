import java.util.Arrays;

public  class hasSingleMode{

    public static void main(String [] args){

        int[] arr = { 1, -29, 8, 5, -29, 6 };
		//System.out.println(hasSingleMode(arr));

		int[] arr2 = { 1, 2, 3, 4, 2, 4, 7 };
		System.out.println(hasSingleMode(arr2));

		int[] arr3 = { 1, 2, 3, 4, 6 };
		//System.out.println(hasSingleMode(arr3));

		int[] arr4 = { 7, 1, 2, 1, 7, 4, 2, 7 };
		//System.out.println(hasSingleMode(arr4));
    }

    static int hasSingleMode(int [] arr){

        int [] ans = findUniqueElements(arr);
        int len = ans.length;
        int [] mode = new int[len];
        int count = 0;
        int index = 0;

        for (int i=0; i< ans.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (ans[i] == arr[j]){
                    count += 1;
                }
            }
            mode[index] = count;
            index += 1;
            count = 0;
        }

        System.out.println(Arrays.toString(mode)); //[1, 2, 1, 2, 1]  //[1, 2, 1, 1, 1]
        
        int max = ans[0];
        for (int i = 1; i < ans.length; i++){
            if (ans[i] > max){
                max = ans[i]; 
            }
        }

        int duplicates = 0;
        for (int i = 0; i < ans.length; i++){
            if(ans[i] == max){
                duplicates += 1;
            }
        }
        if(duplicates > 1){
            return 0;
        }else{
            return 1;
        }       
    }

    static int [] findUniqueElements(int[] a){
        int index = 0;
        int [] ans = new int[uniqueElements(a)];
        
        for (int i = 0; i < a.length; i++){
            int j;
            for (j = 0; j < i; j++)
            {
                if (a[i] == a[j]){
                    break;
                }
            }
            if (j == i){
                ans[index] += a[i];
                index += 1;
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    static int uniqueElements(int[] a){
        int count = 0;
        
        for (int i = 0; i < a.length; i++){
            int j;
            for (j = 0; j < i; j++)
            {
                if (a[i] == a[j]){
                    break;
                }
            }
            if (j == i){
                count += 1;
            }
        }
        System.out.println(count);
        return count;
}
}
import java.util.Arrays;

public  class SingleMode{

    public static void main(String [] args){

        int[] arr = { 1, -29, 8, 5, -29, 6 }; // returns 1 
		System.out.println(hasSingleMode(arr));

		int[] arr2 = { 1, 2, 3, 4, 2, 4, 7 };
		System.out.println(hasSingleMode(arr2)); // returns 0

		int[] arr3 = { 1, 2, 3, 4, 6 };
		System.out.println(hasSingleMode(arr3)); // returns 0

		int[] arr4 = { 7, 1, 2, 1, 7, 4, 2, 7 };
		System.out.println(hasSingleMode(arr4)); // returns 1
    }

    static int hasSingleMode(int [] arr){

        int [] ans = findUniqueElements(arr);
        int len = ans.length;
        int [] mode = new int[len];
        int count = 0;
        int index = 0;

        // To fill the array of the repetitions of a number in the original array
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
        
         // Examples mode = [1, 2, 1, 2, 1] , mode = [1, 2, 1, 1, 1]
        // After get the mod array which containes the number of times a number is repeated
        // Calculate the max value of that array
        System.out.println(" ");
        System.out.println("Original array "+ Arrays.toString((arr)));
        System.out.println("Unique elements " + Arrays.toString(ans));
        System.out.println("Mode of each element " + Arrays.toString(mode));
               
        int max = mode[0];
        for (int i = 1; i < mode.length; i++){
            if (mode[i] > max){
                max = mode[i]; 
            }
        }
        // Increase in one if the max value repets one time on the array, it means it appears just one 
        int duplicates = 0;
        for (int i = 0; i < mode.length; i++){
            if(mode[i] == max){
                duplicates += 1;
            }
        }
        // If duplicate occurs just One then return 1, if occurs more than One, return 0
        if(duplicates == 1){
            return 1;
        }else{
            return 0;
        }       
    }

    // It will return  the unique elements in the original array
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
        return ans;
    }

    // it will return the number of unique elements
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
        return count;
}
}
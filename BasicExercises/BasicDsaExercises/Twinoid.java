public class Twinoid {

    public static void main(String [] args ){

        int[] arr = { 3, 3, 2, 6, 7 };
		System.out.println(isTwinoid(arr)); // 1

		int[] arr2 = { 3, 3, 2, 6, 6, 7 };
		System.out.println(isTwinoid(arr2)); // 0

		int[] arr3 = { 3, 3, 2, 7, 6, 7 };
		System.out.println(isTwinoid(arr3)); // 0

		int[] arr4 = { 3, 8, 5, 7, 3 };
		System.out.println(isTwinoid(arr4)); // 0
		
		// added new test case to cover new edge case
		int[] arr5 = { 3, 81, 5, 3, 20 };
		System.out.println(isTwinoid(arr5)); // 0
    }
    static int isTwinoid(int a[]){
        int i;
        int flag = 0;

        for (i = 0; i < a.length - 1; i++){
            if (a[i]% 2 == 0 & a[i + 1] % 2 == 0){
                if (flag == 1)
                    return 0;
                flag = 1;
            }
        }
        return flag;
    }
}
// A twinoid is defined to be an array that has exactly two even values that are adjacent to one  another. 
// For example {3, 3, 2, 6, 7} is a twinoid array because it has exactly two even values (2 and  6)
//  and they are adjacent to one another. The following arrays are not twinoid arrays. 
// {3, 3, 2, 6, 6, 7} because it has three even values. 
// {3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another 
// {3, 8, 5, 7, 3} because it has only one even value. 
// Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise  it returns 0. 
// If you are programming in Java or C#, the function signature is 
// int isTwinoid (int [ ] a); 
// If you are programming in C or C++, the function signature is 
// int isTwinoid(int a[ ], int len) where len is the number of elements in the array. 


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
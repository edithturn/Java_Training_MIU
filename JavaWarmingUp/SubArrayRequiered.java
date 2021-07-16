// Question Number 03

public class SubArrayRequiered{

    public static void main(String[] args){
        
        char[] arr1 = {'a', 'b', 'c'};
      
        System.out.println(Arrays.toString(f(arr1, 0, 4))); //null
        System.out.println(f(arr1, 0, 3));
        System.out.println(f(arr1, 0, 2));
        System.out.println(f(arr1, 0, 1));
        System.out.println(Arrays.toString(f(arr1, 1, 3))); //null
        System.out.println(f(arr1, 1, 2));

        System.out.println(f(arr1, 1, 1));
        System.out.println(Arrays.toString(f(arr1, 2, 2))); //null
        System.out.println(f(arr1, 2, 1));
        System.out.println(Arrays.toString(f(arr1, 3, 1))); //null
        System.out.println(f(arr1, 1, 0));
        System.out.println(Arrays.toString(f(arr1, -1, 2))); //null
        System.out.println(Arrays.toString(f(arr1, -1, -2))); //null
    }

    static char[] f(char[] a, int start, int lenRequired){
        
        if (start < 0 || lenRequired < 0 || start + lenRequired - 1 >= a.length){
            return null;
        }
        char[] newArr = new char[lenRequired];
        for(int i=start, j = 0; j < lenRequired; i++, j++){
                newArr[j] = a[i];
        }
        return newArr;
    }
}

class OddHeavy{

public static void main(String [] args){

    int a [] = {11, 4, 9, 2, 8};        // 1
    int b [] = {1, 1, 1, 1};            // 1
    int c [] = {2, 4, 6, 8, 11};        // 1
    int d [] = {1};                     // 1
    int e [] = {11, 4, 9, 2, 3, 10};    // 0
    int f [] = {-2, -4, -6, -8, -11};   // 0 why this is zero?
    int g [] = {2};                     // 0
    
    System.out.println(isOddHeavy(a));
    System.out.println(isOddHeavy(b));
    System.out.println(isOddHeavy(c));
    System.out.println(isOddHeavy(d));
    System.out.println(isOddHeavy(e));
    System.out.println(isOddHeavy(f));
    System.out.println(isOddHeavy(g));
}

static int isOddHeavy(int[] a){  //{11, 4, 9, 2, 8};

    if(a.length == 1 && a[0] % 2 == 0)
        return 0;
    for(int i = 0; i < a.length; i++){
        if(a[i] % 2 > 0){
            for(int j = 0; j < a.length; j++){
                if(a[j] % 2 == 0){
                    if(a[i] < a[j])
                        return 0;
                }
            }
        }
    }
    return 1;
    }
}


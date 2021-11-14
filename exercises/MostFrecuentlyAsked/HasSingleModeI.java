class HasSingleModeI{

    public static void main(String [] args){

        int a [] = {1, -29, 8, 5, -29, 6};
        int b [] = {1, 2, 3, 4, 2, 4, 7};
        int c [] = {1, 2, 3, 4, 6};
        int d [] = {7, 1, 2, 1, 7, 4, 2, 7};

        System.out.println(hasSingleMode(a, 6)); // 1
        System.out.println(hasSingleMode(b, 7)); // 0
        System.out.println(hasSingleMode(c, 5)); // 0
        System.out.println(hasSingleMode(d, 8)); // 1

    }

    static  int hasSingleMode(int a[], int len){

        int first_count = 0;
        int second_count = 0;
        int max = 0;

        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                if(a[i] == a[j])
                    first_count++;
            }
            if(first_count == max)
                return 0;
            if(first_count > max)
                max = first_count;
            first_count = 0;       
            
        }
        return 1;

    } 
}
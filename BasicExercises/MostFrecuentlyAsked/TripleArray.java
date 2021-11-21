class TripleArray{

    public static void main(String [] args){

        int a [] = {3, 1, 2, 1, 3, 1, 3, 2, 2};
        int b [] = {2, 5, 2, 5, 5, 2, 5} ;
        int c [] = {3, 1, 1, 1};

        System.out.println(isTriple(a));
        System.out.println(isTriple(b));
        System.out.println(isTriple(c));

    }

    static int isTriple (int[ ] a){

        int target = 3;
        int count = 0;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count == target)
                count = 0;
            else
                return 0;
        }
        return 1;
    }
}
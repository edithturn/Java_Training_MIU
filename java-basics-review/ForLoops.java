class ForLoops{
    public static void main(String[] args){

        int[] arr = {1,5,3,4,5,6};

        for(int x = 0; x < arr.length; x++){
            if (arr[x] == 5){
                System.out.println("found a 5 on index: " + x);
            }
            
        }
    }
}
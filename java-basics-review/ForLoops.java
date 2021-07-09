import java.util.Scanner;

class ForLoops{
    public static void main(String[] args){

        int[] arr = {1,5,3,4,5,6};
        String[] names = new String[5];
        Scanner sc  = new Scanner(System.in);
        int count = 0;

        for (int element:arr){
           System.out.println(element + " " + count); 
           count++;
        }

        for (int i = 0; i < names.length; i++){
            System.out.print("Input: ");
            String input  = sc.nextLine();
            names[i] = input;
        }

        for(String n:names){
            System.out.println(n);
            if (n.equals("edith")){
                break;
            }
        }

        for(int x = 0; x < arr.length; x++){
            if (arr[x] == 5){
                System.out.println("found a 5 on index: " + x);
            }            
        }

    }
}
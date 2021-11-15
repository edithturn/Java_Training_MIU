public class SwitchExample{

    public static void main(String[] args){
        int a = 7;

        switch (2) {
            case 1:
                System.out.println("This is the 01");
                break;
            case 2:
                System.out.println("This is case 02");
            case 3:
                System.out.println("This is case 03");
                break;
            default:
                System.out.println("No hay coincidencia");
            break;
        }
    }
}
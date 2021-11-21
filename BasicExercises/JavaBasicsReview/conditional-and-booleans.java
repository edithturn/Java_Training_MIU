class ConditionBooleans {

    public static void main(String[] args){
        int x = 7;
        int y = 5;
        int z = 10;

        // > <  == >= <= !=
        boolean compare1 = x != y && z < y;
        boolean compare2 = !(x > y || z < y);

        System.out.println(compare1);
        System.out.println(compare2);

    }

}
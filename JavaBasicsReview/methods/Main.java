public class Main{
    public static void main(String[] args)
    {
        Student edith = new Student("Edith");
        Student bill = new Student("bill");
        Student nirmal = new Student("Nirmal");

        System.out.println(edith.compareTo(bill) > 0);
}
}
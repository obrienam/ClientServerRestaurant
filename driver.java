public class driver
{    
    public static void main(String[] args)
    {
        chef Chef = new chef();
        String[] orders={"Steak","Salad","Chicken Strips","Burger"};
        table Table = new table(4, orders);
        waiter Waiter = new waiter();
        System.out.println("Initialized");
    }
}
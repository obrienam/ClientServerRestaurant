public class driver
{    
    public static void main(String[] args)
    {
        chef Chef = new chef();
        String[] orders1={"Steak","Salad","Chicken Strips","Burger"};
        table Table1 = new table(4, orders1);
        String[] orders2={"Steak","Salad","Chicken Strips","Burger"};
        table Table2 = new table(4, orders2);
        String[] orders3={"Steak","Salad","Chicken Strips","Burger"};
        table Table3 = new table(4, orders3);
        String[] orders4={"Steak","Salad","Chicken Strips","Burger"};
        table Table4 = new table(4, orders4);
        waiter Waiter = new waiter();
        table[] tables=new table[]{Table1,Table2,Table3,Table4};
        for(int i=0;i<4;i++)
        {
            System.out.printf("Waiter taking order %d\n",i);
            Waiter.takeOrder(tables[i].giveOrders());
            System.out.printf("Waiter delivering order %d\n",i);
            Chef.getSheet(Waiter.giveOrderSheet());
        }
        System.out.println("Initialized");
    }
}
public class driver
{    
    public static void main(String[] args)
    {
        try
        {
            chef Chef = new chef();
            String[] orders1={"Steak","Salad","Chicken Strips","Burger"};
            table Table1 = new table(4, orders1);
            String[] orders2={"Wrap","Salad","Ribs","Burger"};
            table Table2 = new table(4, orders2);
            String[] orders3={"Wings","Tacos","Salad","Burger"};
            table Table3 = new table(4, orders3);
            String[] orders4={"Tacos","Chicken Strips","Salad","Burger"};
            table Table4 = new table(4, orders4);
            waiter Waiter = new waiter();
            table[] tables=new table[]{Table1,Table2,Table3,Table4};
            System.out.println("");
            System.out.println("Client Surver Architecture Basic Implementation");
            System.out.println("Represented by a food ordering system at a restaurant");
            System.out.println("Clients are the 4 tables");
            System.out.println("Network is the waiter");
            System.out.println("Server is the chef");
            System.out.println("");
            Thread.sleep(3000);
            
            for(int i=0;i<4;i++)
            {
                System.out.printf("Table %d gave order to waiter\n",i+1);
                Thread.sleep(2000);
                Waiter.takeOrder(tables[i].giveOrders());
                System.out.printf("Waiter delivering sheet for order %d to chef\n",i+1);
                Thread.sleep(2000);
                Chef.getSheet(Waiter.giveOrderSheet());
                Chef.makeFood();
                Waiter.takeFood(Chef.giveFood());
                Thread.sleep(2000);
                System.out.printf("Waiter delivering order %d to table %d\n",i+1,i+1);
                Thread.sleep(2000);
                System.out.println(tables[i].receiveFood(Waiter.bringFood()));
                Thread.sleep(2000);
                System.out.println("");
            }
        
        }
        catch(InterruptedException e)
        {
          System.out.println("Error");
        }
    }
}

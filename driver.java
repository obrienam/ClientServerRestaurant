//This is the driver code for the client server
//architecture used to simulate the food ordering
//system at a common restaurant. In this simulation there
//are four clients(tables) who submit requests 
//to the server(chef) through the network(waiter).
//Once their request is fulfilled, the server gives
//the requested information back to the client
//through the network again.
public class driver
{    
    public static void main(String[] args)
    {
        try
        {
            //Initilization code
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
            System.out.println("This is a simulation of a restaurant food ordering system");
            System.out.println("represented by a client server architecture.");
            System.out.println("Clients are the 4 tables");
            System.out.println("Network is the waiter");
            System.out.println("Server is the chef");
            System.out.println("");
            Thread.sleep(3000);
            
            //Client Server simulation code
            for(int i=0;i<4;i++)
            {
                //Client submits request.
                System.out.printf("Table %d gave order to waiter\n",i+1);
                Thread.sleep(2000);
                //Network communicates request to server.
                Waiter.takeOrder(tables[i].giveOrders());
                System.out.printf("Waiter delivers order sheet %d to chef\n",i+1);
                Thread.sleep(2000);
                //Server retrieves requested information.
                Chef.getSheet(Waiter.giveOrderSheet());
                Chef.makeFood();
                Waiter.takeFood(Chef.giveFood());
                Thread.sleep(2000);
                //Network delivers requested information to client.
                System.out.printf("Waiter delivers order %d to table %d\n",i+1,i+1);
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

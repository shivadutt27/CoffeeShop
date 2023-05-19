import java.util.ArrayList;

public class CoffeeKiosk
{

	private ArrayList<Item> menu;
	private ArrayList<Order> orders;

	public CoffeeKiosk()
	{
		this.menu = new ArrayList<Item>();
		this.orders = new ArrayList<Order>();
	
	}

	
	
	public void addMenuItem(String name, double price)
	{
		Item item = new Item(name, price);
		this.menu.add(item);
		int getIndex = this.menu.indexOf(item);
		item.setIndex(getIndex);
	}

/*
	public void addMenuItemByInput()
	{
		displayMethod();
		boolean flag = true;
		while(flag)
		{
			System.out.println("Please enter index or name of Item or press q to quit");
			String getInput = System.console.readLine();
			if(!(getInput))
	
		}
	
	}

*/
	public void displayMethod()
	{
		for(Item item: this.menu)
		{
			System.out.println(item.getIndex()+" "+item.getName()+" -- "+"$"+item.getPrice());
		}
	}

	public void newOrder()
	{
	
		System.out.println("Please enter customer name for new Order \n");
		String getName = System.console().readLine();
		
		Order order = new Order(getName);
		this.orders.add(order);
		displayMethod();

		
		
		boolean flag = true;
		while(flag)
		{
			System.out.println("Please enter a menu item index or q to quit \n");
			String getInput = System.console().readLine();
			
			if(!(getInput.equalsIgnoreCase("q")))
			{
				int getInt = Integer.parseInt(getInput);
				Item getItem = menu.get(getInt);
				order.addItem(getItem);

			}else{

				flag=false;
			}
			
		}
		

		order.displayOrder();	
		
		//this.orders.add(order);
	
	}	
}

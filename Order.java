
import java.util.ArrayList;

public class Order
{
	private String name;
	private double total;
	private boolean ready;
	private ArrayList<Item> items;

	public Order(String name)
	{
		this.name = name;
		this.items = new ArrayList<Item>();
	}


	public String getName()
	{
		return this.name;
	}

	public double getTotal()
	{
		for(Item item: this.items)
		{
			this.total+=item.getPrice();
		}
		return this.total;
	}

	public boolean getReady()
	{
		return this.ready;
	}

	public void addItem(Item item)
	{
		this.items.add(item);
	}

	public void displayOrder()
	{
		System.out.println("Order Name: "+getName()+" "+" order total: "+ getTotal()+" Order Status: "+getReady());
	}

}

public class Item

{
	private String name;
	private double price;
	private int index;


	public Item (String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	

	public String getName()
	{
		return this.name;
	}

	public double getPrice()
	{
		return this.price;
	}
	
	public void setIndex(int index)
	{
		this.index = index;
	}

	public int getIndex()
	{
		return this.index;
	}


}

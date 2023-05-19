public class TestOrder
{
	public static void main(String[] args)
	{
		CoffeeKiosk cf1 = new CoffeeKiosk();
		
		cf1.addMenuItem("banana",2.00);
		cf1.addMenuItem("coffee", 1.50);
		cf1.addMenuItem("latte",4.50);	
		
		cf1.newOrder();
	}
}

package VendingMachine;

public class Item {
	ItemType type;
	int price;
	public void setType(ItemType type)
	{
		this.type=type;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public ItemType getType()
	{
		return this.type;
	}
	public int getPrice()
	{
		return this.price;
	}
}

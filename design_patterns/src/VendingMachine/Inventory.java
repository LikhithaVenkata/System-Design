package VendingMachine;

public class Inventory {
	ItemShelf[] items;
	
	public ItemShelf[] getItems() {
		return items;
	}

	public Item getItems(int codeNumber) {
		for(int i=0;i<items.length;i++)
		{
			if(items[i].getCode()==codeNumber)
				return items[i].getItem();
		}
		return null;
	}
	
	public void updateSoldItem(int codeNumber) {
		for(int i=0;i<items.length;i++)
		{
			if(items[i].getCode()==codeNumber)
				items[i].setSoldOut(true);
		}
	}

	public void setItems(ItemShelf[] items) {
		this.items = items;
	}

	Inventory(int itemsCount)
	{
		items=new ItemShelf[itemsCount];
		initializeInventory();
	}
	
	void initializeInventory()
	{
		int StartCode=101;
		for(int i=0;i<items.length;i++)
		{
			ItemShelf space=new ItemShelf();
			space.setCode(StartCode);
			space.setSoldOut(true);
			items[i]=space;
			StartCode++;
		}
	}
	void addItem(Item item,int codeNumber) throws Exception
	{
		for(ItemShelf shelf: items)
		{
			if(shelf.getCode()==codeNumber)
			{
				if(shelf.soldOut)
				{
					shelf.item=item;
					shelf.setSoldOut(false);
				}
				else
					throw new Exception("Item is already available");
			}
		}
	}
}
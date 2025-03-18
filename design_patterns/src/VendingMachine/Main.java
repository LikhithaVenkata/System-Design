package VendingMachine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine machine=new VendingMachine();
		try {
			System.out.println("|");
			System.out.println("Filling up inventory");
			System.out.println("|");
			fillUpInventory(machine);
			displayInventory(machine);
			System.out.println("|");
			System.out.println("Clicking on Insert coin button");
			System.out.println("|");
			
			State machineState=machine.getMachineState();
			machineState.insertCoinButton(machine);
			
			machineState=machine.getMachineState();
			machineState.insertCoin(machine,Coin.NICKEL);
			machineState.insertCoin(machine,Coin.QUARTER);
			
			System.out.println("|");
			System.out.println("Clicking on Product slection button");
			System.out.println("|");
			
			machineState.productSelectionButton(machine);
			
			machineState=machine.getMachineState();
			machineState.chooseProduct(machine,102);
			
			displayInventory(machine);
			
		} catch(Exception e) {
			System.out.println("exception");
		}
	}
	
	private static void fillUpInventory(VendingMachine machine)
	{
		ItemShelf[] items =machine.getInventory().getItems();
		for(int i=0;i<items.length;i++)
		{
			Item item=new Item();
			if(i<3)
			{
				item.setType(ItemType.coke);
				item.setPrice(20);
			}
			else if(i>=3 && i<6)
			{
				item.setType(ItemType.soda);
				item.setPrice(15);
			}
			else if(i>=6 && i<9)
			{
				item.setType(ItemType.juice);
				item.setPrice(25);
			}
			else if(i>=9)
			{
				item.setType(ItemType.pepsi);
				item.setPrice(20);
			}
			items[i].setItem(item);
			items[i].setSoldOut(false);
		}	
	}
	private static void displayInventory(VendingMachine machine)
	{
		ItemShelf[] items =machine.getInventory().getItems();
		for(int i=0;i<items.length;i++)
		{
			System.out.println("Item code:"+items[i].getCode()+"||"+"Item : "
					+items[i].getItem().getType()+ "||"+"Price :"
					+items[i].getItem().getPrice()
			+ "||"+"isAvailable :" + !items[i].isSoldOut());
		}
	}
}

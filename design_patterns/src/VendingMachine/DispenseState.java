package VendingMachine;

import java.util.List;

public class DispenseState implements State{
	
	DispenseState(VendingMachine machine,int codeNumber)throws Exception
	{
		dispenseProduct(machine,codeNumber);
	}

	@Override
	public void insertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void productSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getChange(int returnChange) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Item is in dispense state");
		Item item=machine.getInventory().getItems(codeNumber);
		machine.getInventory().updateSoldItem(codeNumber);
		machine.setMachineState(new IdleState());
		return item;
	}

	@Override
	public List<Coin> refundMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

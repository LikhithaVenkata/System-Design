package VendingMachine;

import java.util.List;

public class ProductSelectionState implements State{

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
		Item item=machine.getInventory().getItems(codeNumber);
		int paidByUser=0;
		for(int i=0;i<machine.getCoin_list().size();i++)
			paidByUser+=machine.getCoin_list().get(i).value;
		if(paidByUser<item.getPrice())
		{
			System.out.println("Insufficient Amount");
			refundMoney(machine);
			throw new Exception("Insufficient Amount"); 
		}
		if(paidByUser>=item.getPrice())
		{
			if(paidByUser>item.getPrice())
				getChange(paidByUser-item.getPrice());
			machine.setMachineState(new DispenseState(machine,codeNumber));
		}
	}

	@Override
	public int getChange(int returnChange) throws Exception {
		// TODO Auto-generated method stub
		return returnChange;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Produt cannot be dispensed in SelectionState");
	}

	@Override
	public List<Coin> refundMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Returned full amount");
		machine.setMachineState(new IdleState(machine));
		return machine.getCoin_list();
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}

package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{
	

	public IdleState()
	{
		System.out.println("Machine is in Idle state");
	}
	public IdleState(VendingMachine machine)
	{
		System.out.println("Machine is in Idle state");
		machine.setCoin_list(new ArrayList<>());
	}
	@Override
	public void insertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		machine.setMachineState(new HasMoneyState());
	}

	@Override
	public void productSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("click on Insert coin button");
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("You cannot insert coin in Idle state");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("You cannot choose product in Idle state");
	}

	@Override
	public int getChange(int returnChange) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Produt cannot be dispensed in SelectionState");
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

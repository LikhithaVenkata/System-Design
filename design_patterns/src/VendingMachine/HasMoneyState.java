package VendingMachine;

import java.util.List;

public class HasMoneyState implements State{

	@Override
	public void insertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void productSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		machine.setMachineState(new ProductSelectionState());
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("accepted coin");
		machine.getCoin_list().add(coin);
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("You cannot choose product in HasMoney State");
	}

	@Override
	public int getChange(int returnChange) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		return null;
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

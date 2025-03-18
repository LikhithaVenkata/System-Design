package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
	public State machineState;
	Inventory inventory;
	List<Coin> coin_list;
	
	VendingMachine()
	{
		machineState=new IdleState();
		inventory=new Inventory(10);
		coin_list=new ArrayList<>();
	}
	
	public State getMachineState() {
		return machineState;
	}

	public void setMachineState(State machineState) {
		this.machineState = machineState;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public List<Coin> getCoin_list() {
		return coin_list;
	}

	public void setCoin_list(List<Coin> coin_list) {
		this.coin_list = coin_list;
	}

}

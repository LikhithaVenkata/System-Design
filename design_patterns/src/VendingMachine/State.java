package VendingMachine;

import java.util.List;

public interface State {
	void insertCoinButton(VendingMachine machine)throws Exception;
	void productSelectionButton(VendingMachine machine)throws Exception;
	void insertCoin(VendingMachine machine,Coin coin)throws Exception;
	void chooseProduct(VendingMachine machine,int codeNumber)throws Exception;
	int getChange(int returnChange)throws Exception;
	Item dispenseProduct(VendingMachine machine,int codeNumber)throws Exception;
	List<Coin> refundMoney(VendingMachine machine)throws Exception;
	void updateInventory(VendingMachine machine,Item item,int codeNumber)throws Exception;
	
}

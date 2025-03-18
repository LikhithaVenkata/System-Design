package LLD_Patterns.Observer;

public class TV implements Observer{

	@Override
	public void update(int temperature) {
		System.out.println("Temperature is updated to :"+ temperature);
	} 
}

package LLD_Patterns.Observer;

public class Phone implements Observer{

	public void update(int temperature)
	{
		System.out.println("Phone display : Temperature is updated to :"+ temperature);
		
	}
}

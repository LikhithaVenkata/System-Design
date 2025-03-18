package LLD_Patterns.Strategy;

public class Vechile {
	Strategy strategy_object;
	public Vechile(Strategy obj)
	{
		this.strategy_object=obj;
	}
	public void drive() {
		// TODO Auto-generated method stub
		strategy_object.drive();
	}
}

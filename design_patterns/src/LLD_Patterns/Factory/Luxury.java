package LLD_Patterns.Factory;

public class Luxury{
	Luxury(){}
	public Vechile getCar(String car)
	{
		switch(car)
		{
		case("Bmw"):
			return new Bmw();
		case("Benz"):
			return new Benz();
		default:
			return null;
	}
}
}
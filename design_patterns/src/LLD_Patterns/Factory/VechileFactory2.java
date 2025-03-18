package LLD_Patterns.Factory;

public class VechileFactory2 {
	public VechileFactory1 get_vechile_type(String s)
	{
		switch(s)
		{
		case("Luxury"):
			return new Luxury();
		case("Ordinary"):
			return new Ordinary();
		default:
			return null;
		}
	}
}

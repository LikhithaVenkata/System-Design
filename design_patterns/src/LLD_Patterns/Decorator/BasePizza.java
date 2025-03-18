package LLD_Patterns.Decorator;

public abstract class BasePizza {
	public abstract int cost();
}

class Margheritta extends BasePizza{
	public int cost()
	{
		return 100;
	}
}

class VegDelight extends BasePizza{
	public int cost()
	{
		return 120;
	}
}

class ChickenPattaka extends BasePizza{
	public int cost()
	{
		return 150;
	}
}
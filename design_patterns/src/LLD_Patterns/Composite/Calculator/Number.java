package LLD_Patterns.Composite.Calculator;

public class Number implements Calculate{

	int number;
	Number(int n)
	{
		this.number=n;
	}
	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return number;
	}

}

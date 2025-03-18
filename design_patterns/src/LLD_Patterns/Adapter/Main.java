package LLD_Patterns.Adapter;

public class Main {
	public static void main(String[] args)
	{
	WeightMachine m=new WeightMachineImpl(new WeightInPoundsImpl());
	double val=m.convertToKgs();
	System.out.println(val);
	}
}

package LLD_Patterns.Adapter;

public class WeightMachineImpl implements WeightMachine{

	WeightInPounds weight;
	
	WeightMachineImpl(WeightInPounds weight)
	{
		this.weight=weight;
	}
	
	@Override
	public double convertToKgs() {
		// TODO Auto-generated method stub
		double val=weight.getWeightInPounds();
		return val*45;
	}
}

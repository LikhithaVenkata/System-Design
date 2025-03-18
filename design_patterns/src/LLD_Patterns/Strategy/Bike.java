package LLD_Patterns.Strategy;

public class Bike extends Vechile{
	 Bike()
	{
		super(new NormalDrive());
	}
}

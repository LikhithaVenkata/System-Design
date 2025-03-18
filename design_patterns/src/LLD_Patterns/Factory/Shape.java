package LLD_Patterns.Factory;

public interface Shape {
	void draw();
}

class Circle implements Shape
{
	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}	
}

class Square implements Shape
{
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}	
}

class Rectangle implements Shape
{
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}	
}
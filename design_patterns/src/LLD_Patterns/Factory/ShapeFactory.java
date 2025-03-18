package LLD_Patterns.Factory;

public class ShapeFactory {
	ShapeFactory(){}
	
	public Shape getShape(String s)
	{
	switch(s)
	{
	case ("CIRCLE"):
		return new Circle();
	case ("SQUARE"):
		return new Square();
	default: 
		return new Rectangle();
	}
}
}

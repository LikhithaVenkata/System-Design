package LLD_Patterns.Factory;

public class Main {

	public static void main(String[] args) {
		ShapeFactory s=new ShapeFactory();
		Shape shape=s.getShape("Rect");
		shape.draw();
		}
}

package LLD_Patterns.Decorator;

public class Main {

	public static void main(String[] args) {
		BasePizza p=new Chicken(new Cheese(new Margheritta()));
		System.out.println(p.cost());
	}

}

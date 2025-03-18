package LLD_Patterns.Decorator;

public abstract class Toppings extends BasePizza{
	public abstract int cost();
}

class Veggies extends Toppings
{
	BasePizza pizza;
	Veggies(BasePizza p){
		this.pizza=p;
	}
	@Override
	public int cost() {
		return pizza.cost()+20;
	}	
}

class Chicken extends Toppings
{
	BasePizza pizza;
	Chicken(BasePizza p){
		this.pizza=p;
	}
	@Override
	public int cost() {
		return pizza.cost()+50;
	}	
}

class Cheese extends Toppings
{
	BasePizza pizza;
	Cheese(BasePizza p){
		this.pizza=p;
	}
	@Override
	public int cost() {
		return pizza.cost()+30;
	}	
}
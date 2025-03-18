package LLD_Patterns.Composite.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate n1=new Number(1);
		Calculate n2=new Number(7);
		Calculate e1=new Expression(n1,n2,Operation.ADD);
		Number n3=new Number(10);
		Calculate e2=new Expression(n3,e1,Operation.MUL);
		System.out.println(e2.evaluate());
	}

}

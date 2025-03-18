package LLD_Patterns.Composite.Calculator;

public class Expression implements Calculate{

	Calculate leftPart;
	Calculate rightPart;
	Operation operation;
	Expression(Calculate left,Calculate right,Operation oper)
	{
		this.leftPart=left;
		this.rightPart=right;
		this.operation=oper;
	}
	@Override
	public int evaluate() {
		int value=0;
		// TODO Auto-generated method stub
		switch(operation)
		{
		case ADD:
			value=leftPart.evaluate() + rightPart.evaluate();
			break;
		case SUB:
			value=leftPart.evaluate() - rightPart.evaluate();
			break;
		case MUL:
			value=leftPart.evaluate() * rightPart.evaluate();
			break;
		case DIV:
			value=leftPart.evaluate() / rightPart.evaluate();
			break;
		}
		return value;		
	}
	
}

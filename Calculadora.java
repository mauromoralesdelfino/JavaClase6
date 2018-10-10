package clase9Oct;

public class Calculadora<C extends Number, D extends Number> {

	public Number Sumar(Number a, Number b)
	{
		Number r;
		r = a.doubleValue() + b.doubleValue();
		
		
		return r;
		
	}
	
	public Number Restar(Number a, Number b)
	{
		Number r;
		r = a.doubleValue() - b.doubleValue();
		
		
		return r;
		
	}
	
	
}

package clase9Oct;

public class Caja<T extends Number> {
	
	T o;
	

	public T get()
	{ 
		return o;
	}
	
	public void set(T t) {
		this.o = t;
	}
	
	/*main//
	*
	*Caja<Persona> c = new Caja<Persona>();
	*c.get();
	*caja c2 ) new Caja();
	*
	*
	*/

}

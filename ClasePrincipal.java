package clase9Oct;
import java.util.*;
public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List lista = new LinkedList();
		Set colSet = new HashSet();
		
		lista.add("hola");
		lista.add("hola");
		lista.add("algo");
		
		colSet.add("hola");
		colSet.add("hola");
		colSet.add("algo");
		
		for(int i =0;i<lista.size();i++)
		{
			System.out.println(lista.get(i));
		}
	for(Object o : colSet)
	{
		System.out.println(o);
	}

	Set <Persona> set1 = new HashSet();
	set1.add(new Persona("Matias","Ramos"));
	set1.add(new Persona("Matias","Ramos"));
	
	for(Persona p : set1)
	{
		System.out.println(p.nombre);
		//sobrescribir equal
	}
	
	/*main//
	*
	*Caja<Persona> c = new Caja<Persona>();
	*c.get();
	*caja c2 ) new Caja();
	*
	*
	*/

	Calculadora<Integer,Double> c = new Calculadora<Integer,Double>();
	Number r = c.Sumar(1,2);
	Number z = c.Restar(1, 2);
	
	System.out.println(r);
	System.out.println(z);
	
	
	
	
	
	}

}

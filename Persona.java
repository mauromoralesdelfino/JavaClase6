package clase9Oct;

public class Persona {
	
	String nombre;
	String apellido;
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	@Override
	public boolean equals (Object obj)
	{
 
        if (obj instanceof Persona) 
        {
 
        Persona tmpPersona = (Persona) obj;
 
            if (this.nombre.equals(tmpPersona.nombre) && this.apellido.equals(tmpPersona.apellido))
            	{ 
            		return true; 
            	}
            		else { return false; }
 
      } else { return false; }
	}
	
	public int hashCode()
	  {
		  final int key = 31;
		  int numero =1;
		  
		  if(this.nombre != null)
		  {
			  numero += numero *  key * this.nombre.hashCode();
		  }
		  if(this.apellido != null)
		  {
			  numero += numero *  key * this.apellido.hashCode();
		  }
		 
		  
		  return numero;
	  }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/*@Override
	  public boolean equals(Object obj, Object obj)
	  {
		  if(this == obj)
		  {
			  return true;
			  
		  }
		  if(obj == null)
		  {
			  return false;
		  }
		  if(this.getClass() != obj.getClass())
		  	{
			  return false;
		  	}
		  
		  Persona tmpPersona = (Persona) obj;
		  //if(tmpPersona._dni != null)
		  	//{
			  if(this.nombre.equalsIgnoreCase(tmpPersona.nombre))
			  {
				  return true;
			  }
		  	//}
		  
		  return false;
		  
	  }*/
	

}

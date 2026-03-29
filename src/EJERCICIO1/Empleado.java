package EJERCICIO1;

public class Empleado extends Persona 
{
	
	// Atributos
	
	
	private final int legajo;
	private String puesto;
	private static int contador=999;
	
	
	// metodos
	
	public static int devolverProximoLegajo()
	{
		return contador+1;
	}
	
	
	// constructores
	
	public Empleado()
	{
		contador++;
		
		this.legajo = contador;
	}
	
	
	
	// Getters y setters

	
	public int getLegajo() 
	{
		return legajo;
	}
	
	
	public String getPuesto() 
	{
		return puesto;
	}
	
	public void setPuesto(String puesto) 
	{
		this.puesto = puesto;
	}
	
	
    // Método toString
    @Override
    public String toString() 
    {
        return "Empleado [legajo=" + legajo + ", puesto=" + puesto + ", " + super.toString() + "]";
    }
}

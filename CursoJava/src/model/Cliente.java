package model;

public class Cliente extends Persona{
	
	private int id;
	public static int contadorCliente;

	  private Empleado empleado;

	  public Cliente(int id,String nombre, String apellidoMaterno, String apellidoPaterno, Direccion direccion,
	      int edad, Empleado empleado) {
	    super(nombre, apellidoMaterno, apellidoPaterno, direccion, edad);
	    this.id = id;
	    this.empleado = empleado;
	  }

	  public Empleado getEmpleado() {
	    return empleado;
	  }

	  public void setEmpleado(Empleado empleado) {
	    this.empleado = empleado;
	  }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

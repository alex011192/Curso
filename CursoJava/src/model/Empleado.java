package model;
import java.util.List;
public class Empleado extends Persona{

	  private int numeroEmpleado;
	  private double sueldo;
	  private List<Cliente> clientes;
	  public static int contEmp = 0;

	  public Empleado(String nombre, String apellidoMaterno, String apellidoPaterno,
	      Direccion direccion,
	      int edad, int numeroEmpleado, double sueldo, List<Cliente> clientes) {
	    super(nombre, apellidoMaterno, apellidoPaterno, direccion, edad);
	    this.numeroEmpleado = numeroEmpleado;
	    this.sueldo = sueldo;
	    this.clientes = clientes;
	  }

	  public int getNumeroEmpleado() {
	    return numeroEmpleado;
	  }

	  public void setNumeroEmpleado(int numeroEmpleado) {
	    this.numeroEmpleado = numeroEmpleado;
	  }

	  public double getSueldo() {
	    return sueldo;
	  }

	  public void setSueldo(double sueldo) {
	    this.sueldo = sueldo;
	  }

	  public List<Cliente> getClientes() {
	    return clientes;
	  }

	  public void setClientes(List<Cliente> clientes) {
	    this.clientes = clientes;
	  }
	}

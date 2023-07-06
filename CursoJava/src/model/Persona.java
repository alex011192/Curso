package model;

public class Persona {
	  private String nombre;
	  private String apellidoMaterno;
	  private String apellidoPaterno;
	  private Direccion direccion;
	  private int edad;

	  public Persona(String nombre, String apellidoMaterno, String apellidoPaterno, Direccion direccion,
	      int edad) {
	    this.nombre = nombre;
	    this.apellidoMaterno = apellidoMaterno;
	    this.apellidoPaterno = apellidoPaterno;
	    this.direccion = direccion;
	    this.edad = edad;
	  }

	  public String getNombre() {
	    return nombre;
	  }

	  public void setNombre(String nombre) {
	    this.nombre = nombre;
	  }

	  public String getApellidoMaterno() {
	    return apellidoMaterno;
	  }

	  public void setApellidoMaterno(String apellidoMaterno) {
	    this.apellidoMaterno = apellidoMaterno;
	  }

	  public String getApellidoPaterno() {
	    return apellidoPaterno;
	  }

	  public void setApellidoPaterno(String apellidoPaterno) {
	    this.apellidoPaterno = apellidoPaterno;
	  }

	  public Direccion getDireccion() {
	    return direccion;
	  }

	  public void setDireccion(Direccion direccion) {
	    this.direccion = direccion;
	  }

	  public int getEdad() {
	    return edad;
	  }

	  public void setEdad(int edad) {
	    this.edad = edad;
	  }
	}

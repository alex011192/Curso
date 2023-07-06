package model;

public class Direccion {
	  private String calle;
	  private String ciudad;
	  private String estado;
	  private String colonia;
	  private int numero;

	  public Direccion(String calle, String ciudad, String estado, String colonia, int numero) {
	    this.calle = calle;
	    this.ciudad = ciudad;
	    this.estado = estado;
	    this.colonia = colonia;
	    this.numero = numero;
	  }
	  public String getCalle() {
	    return calle;
	  }

	  public String getCiudad() {
	    return ciudad;
	  }

	  public String getEstado() {
	    return estado;
	  }

	  public String getColonia() {
	    return colonia;
	  }

	  public int getNumero() {
	    return numero;
	  }
	  public void setCalle(String calle) {
	    this.calle = calle;
	  }

	  public void setCiudad(String ciudad) {
	    this.ciudad = ciudad;
	  }

	  public void setEstado(String estado) {
	    this.estado = estado;
	  }

	  public void setColonia(String colonia) {
	    this.colonia = colonia;
	  }

	  public void setNumero(int numero) {
	    this.numero = numero;
	  }
	}

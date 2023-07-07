package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import service.EmpleadoService;
import service.impl.EmpleadoServiceImpl;

import service.ClienteService;
import service.impl.ClienteServiceImpl;
public class Main {
	
	static List<Integer> empleadosId = new ArrayList<>();
	static List<Integer> clientesId = new ArrayList<>();
	
	public static void main(String[] args) {
///hola
//	    Empleado emp1 = new Empleado(
//	        "Alejandro ", "holaa", "Encina",
//	        new Direccion("Amazonita", "Saltillo", "Coahuila", "Ankara", 896), 30, 1, 20000, null);
//
//	    Empleado emp2 = new Empleado(
//	        "Pedro ", "Plata", "Oyervides",
//	        new Direccion("Calle 10", "Saltillo", "Coahuila", "Morelos", 110), 31, 2, 30000, null);
//
//	    Cliente cliente1 = new Cliente(1,"Karla", "Tapia", "Ruiz", new Direccion("Amazonita", "Saltillo", "Coahuila", "Ankara", 896),
//	    27, null);
//
//	    Cliente cliente2 = new Cliente(2,"Raul", "Garcia", "Flores", new Direccion("Amazonita", "Saltillo", "Coahuila", "Ankara", 896),
//	        27, null);

//	    List<Cliente> lista = new ArrayList<>();
//	    lista.add(cliente1);
//	    emp1.setClientes(lista);
//
//	    List<Cliente> lista2 = new ArrayList<>();
//	    lista2.add(cliente2);
//	    emp1.setClientes(lista2);

	    EmpleadoService empleadoService = new EmpleadoServiceImpl();
//	    empleadoService.addEmpleado(emp1);
//	    empleadoService.addEmpleado(emp2);
	    
	    ClienteService clienteService = new ClienteServiceImpl();
//	    clienteService.addCliente(cliente1);
//	    clienteService.addCliente(cliente2);

	    //agregar empleados y clientes 
	    // statico como contador para el numero de empleado
	    //clase comparable(sets) y comparator
	    

    	String nombreEmp = "";
    	String apellidoPat = "";
    	String apellidoMat = "";
    	int edad = 0;
    	String calle = "";
    	int numCalle = 0;
    	String colonia = "";
    	String ciudad = "";
    	String estado = "";
    	double sueldo = 0;
	    
	    Scanner myObj = new Scanner(System.in);
	    int seleccion;
	    do {
	    	System.out.println("Ingrese el numero de la accion:");
	    	System.out.println("1-Ingresar nuevo empelado");
	    	System.out.println("2-Ingresar nuevo cliente");
		    System.out.println("3- Asignar cliente a empleado");
		    System.out.println("4- Imprimir datos");
		    System.out.println("5- Salir\n");
		    seleccion = myObj.nextInt();
		    switch(seleccion) {
		    case 1 :
		    	System.out.println("----Ingrese la siguiente informacion---");
		    	
		    	System.out.println("-> Nombre del empleado:");
		    	nombreEmp = myObj.next();
		    	System.out.println("-> Apellido paterno:");
		    	apellidoPat = myObj.next();
		    	System.out.println("-> Apellido Materno:");
		    	apellidoMat = myObj.next();
		    	System.out.println("-> Edad:");
		    	edad = myObj.nextInt();
		    	System.out.println("-> Calle:");
		    	calle = myObj.next();
		    	System.out.println("-> numero calle:");
		    	numCalle = myObj.nextInt();
		    	System.out.println("-> Colonia:");
		    	colonia = myObj.next();
		    	System.out.println("-> Ciudad:");
		    	ciudad = myObj.next();
		    	System.out.println("-> Estado:");
		    	estado = myObj.next();
		    	System.out.println("-> sueldo:");
		    	sueldo = myObj.nextDouble();
		    	
		    	Empleado emp = new Empleado(
		    			nombreEmp, apellidoPat, apellidoMat,
		    	        new Direccion(calle, ciudad, estado, colonia, numCalle), edad, Empleado.contEmp, sueldo, null);
		    	Empleado.contEmp++;
		    	empleadoService.addEmpleado(emp);
		    	System.out.println("----Emeplado guardado---\n");
		    	break;
		    case 2 :	
		    	
		    	System.out.println("----Ingrese la siguiente informacion---");
		    	System.out.println("-> Nombre del cliente:");
		    	String nombreCliente = myObj.next();
		    	System.out.println("-> Apellido paterno:");
		    	apellidoPat = myObj.next();
		    	System.out.println("-> Apellido Materno:");
		    	 apellidoMat = myObj.next();
		    	System.out.println("-> Edad:");
		    	edad = myObj.nextInt();
		    	System.out.println("-> Calle:");
		    	calle = myObj.next();
		    	System.out.println("-> numero calle:");
		    	numCalle = myObj.nextInt();
		    	System.out.println("-> Colonia:");
		    	colonia = myObj.next();
		    	System.out.println("-> Ciudad:");
		    	ciudad = myObj.next();
		    	System.out.println("-> Estado:");
		    	estado = myObj.next();
		    	
			    Cliente cliente = new Cliente(Cliente.contadorCliente,nombreCliente, apellidoPat, apellidoMat, new Direccion(calle,ciudad,estado, colonia, numCalle),
			    edad, null);
			    
			    Cliente.contadorCliente++;
			    clienteService.addCliente(cliente);
		    	System.out.println("----Cliente guardado---\n");
		    	break;
		    
		    case 3 : //asignar cliente a empleado
		    			boolean validEmp = true;
		    			boolean valiClient = true;
		    			do {
		    				imprimeEmpleados(empleadoService);
		    				System.out.println("\nIngrese el id del empleado a quien desea asignar un cliente");
		    				int emplSeleccionado = myObj.nextInt();
		    				if( empleadosId.contains(emplSeleccionado)) {
		    					validEmp = false;
		    					do {
		    						imprimeClientesDisponibles(clienteService);
		    						if(!clientesId.isEmpty()) {
		    							System.out.println("\nIngrese el id del cliente que desea asignar al empleado\n");
					    				int clienteSeleccionado = myObj.nextInt();
					    				if(clientesId.contains(clienteSeleccionado)) {
					    					valiClient=false;
					    					
					    					clienteService.addEmpleadoACliente(empleadoService.getEmpleado(emplSeleccionado), clienteSeleccionado);
					    					empleadoService.addClienteAEmpleado(emplSeleccionado,clienteService.getCliente(clienteSeleccionado) );
					    					System.out.println("cliente asignado al empleado");
					    				}else {
				    						System.out.println("\nEl id ingresado no es valido, ingrese un id valido");
				    					}
		    						}else {
		    							System.out.println("\nActualmente no hay clientes sin asignar");
		    							valiClient=false;
		    						}
		    					}while(valiClient);
			    				
		    					}else {
		    						System.out.println("\nEl id ingresado no es valido, ingrese un id valido");
		    					}
		    				
		    			}while(validEmp);
		    	
		    	break;
		    case 4 : //Imprimir datos
		    			imprimeDatos(empleadoService);
		    	
		    	break;
		    default:
		    	if(seleccion != 5) {
		    		System.out.println("Seleccione una opcion valida\n\n");
		    	}else {
		    		System.out.println("Adios");
		    		}
		    }
	    }while(seleccion != 5);

	  }
	
	private static void imprimeEmpleados(EmpleadoService empleadoService) {
		empleadosId.clear();
		System.out.println("Empleados: \n");
		for (Empleado emp : empleadoService.getEmpleados()){
		      System.out.println("ID: " + emp.getNumeroEmpleado()+ " Nombre: "+emp.getNombre());
		      empleadosId.add(emp.getNumeroEmpleado());
		    }
	}
	
	private static void imprimeClientesDisponibles(ClienteService clienteService) {
		clientesId.clear();
		System.out.println("Clientes sin empleado asignado: \n");
		for (Cliente cliente : clienteService.getClientes()){
		      if( cliente.getEmpleado() == null ) {
		    	  System.out.println("ID: " + cliente.getId()+ " Nombre: "+cliente.getNombre());
			      clientesId.add(cliente.getId());
		      }
		    }
	}
	
	private static void imprimeDatos(EmpleadoService empleadoService) {
		System.out.println("----Empleados----: \n");
		for (Empleado emp : empleadoService.getEmpleados()){
		      System.out.println("ID Empleado: " + emp.getNumeroEmpleado()+ " Nombre: "+emp.getNombre());
		      if(emp.getClientes() != null) {
		    	  System.out.println("---Clientes a su cargo: \n");
		    	  for(Cliente cliente : emp.getClientes()){
		    		  System.out.println(" Nombre: "+cliente.getNombre());
			      }
		      }
		      System.out.println("--------------------\n");
		}
	}
	
	
}

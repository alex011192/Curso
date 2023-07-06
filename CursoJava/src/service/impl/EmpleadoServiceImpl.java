package service.impl;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Empleado;
import service.EmpleadoService;

public class EmpleadoServiceImpl implements EmpleadoService {
  private List<Empleado> listaEmpleados  = new ArrayList<Empleado>();

  @Override
  public void addEmpleado(Empleado emp) {
    listaEmpleados.add(emp);
  }

  @Override
  public List<Empleado> getEmpleados(){
    return listaEmpleados;
  }

@Override
public Empleado getEmpleado(int id) {
	for(Empleado emp : getEmpleados()) {
		if(emp.getNumeroEmpleado() == id) {
			return emp;
		}
	}
	return null;
}

@Override
public void addClienteAEmpleado(int id, Cliente cliente) {
	Empleado emp = getEmpleado(id);
	if(emp.getClientes() == null) {
		List<Cliente> lista = new ArrayList<>();
	    lista.add(cliente);
	    emp.setClientes(lista);
	}else {
		List<Cliente> lista = emp.getClientes();
	    lista.add(cliente);
	    emp.setClientes(lista);
	}
}

}

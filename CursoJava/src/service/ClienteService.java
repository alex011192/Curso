package service;

import java.util.List;

import model.Cliente;
import model.Empleado;

public interface ClienteService {
	
	void addCliente(Cliente cliente);
	Cliente getCliente( int id);
	List<Cliente> getClientes();
	void addEmpleadoACliente(Empleado empl, int idCliente);
}

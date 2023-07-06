package service.impl;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Empleado;
import service.ClienteService;

public class ClienteServiceImpl implements ClienteService {
  private List<Cliente> listaCliente  = new ArrayList<Cliente>();

  @Override
  public void addCliente(Cliente cliente) {
	  listaCliente.add(cliente);
  	
  }
	@Override
	public List<Cliente> getClientes() {
		return listaCliente;
	}
	
	@Override
	public Cliente getCliente(int id) {
		for(Cliente cliente : getClientes())
		{
			if(cliente.getId() == id){
				return cliente;
			}
		}
		
		return null;
	}
	
	@Override
	public void addEmpleadoACliente(Empleado empl, int idCliente) {
		
		Cliente cliente = getCliente(idCliente);
		if(cliente != null)
		{	
			cliente.setEmpleado(empl);
		}
	}
}

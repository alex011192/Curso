package service;

import java.util.List;

import model.Cliente;
import model.Empleado;

public interface EmpleadoService {
  void addEmpleado(Empleado emp);

  List<Empleado> getEmpleados();
  
  Empleado getEmpleado(int id);

  void addClienteAEmpleado(int id, Cliente cliente);

}
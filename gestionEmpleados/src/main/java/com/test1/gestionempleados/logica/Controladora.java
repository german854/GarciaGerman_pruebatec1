package com.test1.gestionempleados.logica;

import com.test1.gestionempleados.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEmpleado(empleado empleado) {
        controlPersis.crearEmpleado(empleado);
    }

    public List<empleado> traerEmpleados() {
        return controlPersis.traerEmpleados();
    }

    public void eliminarEmpleado(int idEliminar) {
        controlPersis.eliminarEmpleado(idEliminar);
    }

    public empleado buscarEmpleado(int idEditar) {
       return controlPersis.buscarEmpleado(idEditar);
    }

    public void editarEmpleado(empleado editEmpleado) {
        controlPersis.editarEmpleado(editEmpleado);
    }

}

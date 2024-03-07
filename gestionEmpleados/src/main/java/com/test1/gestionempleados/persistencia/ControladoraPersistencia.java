package com.test1.gestionempleados.persistencia;

import com.test1.gestionempleados.logica.empleado;
import com.test1.gestionempleados.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    empleadoJpaController empleadoJpa = new empleadoJpaController();

    public void crearEmpleado(empleado empleado) {
        empleadoJpa.create(empleado);
    }

    public List<empleado> traerEmpleados() {
        return empleadoJpa.findempleadoEntities();
    }

    public void eliminarEmpleado(int idEliminar) {
        try {
            empleadoJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Este empleado no existe en la base de datos. ");
        }
    }

    public empleado buscarEmpleado(int idEditar) {
        return empleadoJpa.findempleado(idEditar);
    }

    public void editarEmpleado(empleado editEmpleado) {
        try {
            empleadoJpa.edit(editEmpleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Este empleado no se puede modificar porque no ha sido encontrado en la base de datos ");
        }
    }
}

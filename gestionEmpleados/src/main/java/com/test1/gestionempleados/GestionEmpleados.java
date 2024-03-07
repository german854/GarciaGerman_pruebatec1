package com.test1.gestionempleados;

import com.test1.gestionempleados.logica.Controladora;
import com.test1.gestionempleados.logica.empleado;
import java.util.List;

public class GestionEmpleados {

    public static void main (String [ ] args) {
        
        Controladora control = new Controladora();
        
        //Proceso de altas
        //empleado empleado1 = new empleado(1, "Germán", "García", "Jefe", 1.500, "05/03/2024");
        
        //control.crearEmpleado(empleado1);
        
        
        //Proceso de lectura
        
        List<empleado>listaEmpleados = control.traerEmpleados();
        
        for(empleado empl : listaEmpleados){
            System.out.println(empl.toString());
        }
        
        //Proceso de eliminación
        int idEliminar = 1;
        control.eliminarEmpleado(idEliminar);
        
        
        //Proceso de edición
        /*
        int idEditar = 3;
        empleado editEmpleado = control.buscarEmpleado(idEditar);
        editEmpleado.setId(5);
        
        control.editarEmpleado(editEmpleado);
        */
        
    }
}


package Modelo;

import java.util.ArrayList;


public class GrupoDental {
    private float ganancias;
    private ArrayList<Empleado> empleados;
    private ArrayList<Paciente> pacientes;
    
    public GrupoDental() {
    }

    public GrupoDental(float ganancias, ArrayList<Empleado> empleados, ArrayList<Paciente>pacientes) {
        this.ganancias = ganancias;
        this.empleados = empleados;
        this.pacientes = pacientes;
        
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void ingresarAPerfil(){
        
    }
    public void distribuirGanancias(){
        
    }
}


package Modelo;


public class Administrador extends Empleado {
    private float salario;
  
    public Administrador (String nombre, int CI, String direccion, String ciudad, String telefono, int edad, String genero, String correo, Horario horario,float salario) {
     super(nombre,CI,direccion,ciudad,telefono,edad,genero,correo,horario);
     this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void gestionarCitas(){
        
    }
    public void gestionarHorarios(){
        
    }
    public void asignarSueldos(){
        
    }
    public void gestionarEspecialistas(){
        
    }
    public void verEspecialistas(){
        
    }
}

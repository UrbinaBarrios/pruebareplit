
package Modelo;


public abstract class Empleado extends Persona {
    private Horario horario;

    public Empleado(String nombre, int CI, String direccion, String ciudad, String telefono, int edad, String genero, String correo, Horario horario) {
        super(nombre,CI,direccion,ciudad,telefono,edad,genero,correo);
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    public void validarPerfil(String usuario, String contrasena){ //yo agregue contrasena
        
    }
    public void seleccionarEspecialistas(){
        
    }
    public void ingresarUsuario(){
        
    }
}


package Modelo;


public class Higienista extends Empleado{
    private Especialista especialistaAsistido;
    private float ganancias;

    public Higienista(String nombre, int CI, String direccion, String ciudad, String telefono, int edad, String genero, String correo, Horario horario,Especialista especialistaAsistido, float ganancias) {
        super(nombre,CI,direccion,ciudad,telefono,edad,genero,correo,horario);
        this.especialistaAsistido = especialistaAsistido;
        this.ganancias = ganancias;
    }

    public Especialista getEspecialistaAsistido() {
        return especialistaAsistido;
    }

    public void setEspecialistaAsistido(Especialista especialistaAsistido) {
        this.especialistaAsistido = especialistaAsistido;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }
    public void indicarCitasAsistidas() {
        
    }
    public void indicarEspecialistaAsistido() {
        
    }
}

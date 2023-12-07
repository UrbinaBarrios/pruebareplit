
package Modelo;


public class Tratamiento {
    private String nombre;
    private String descripcion;
    private float costoMinimo;
    private float costoMaximo;
    private int numeracionDental; // a veces no tendra valor

    public Tratamiento() {
    }

    public Tratamiento(String nombre, String descripcion, float costoMinimo, float costoMaximo, int numeracionDental) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoMinimo = costoMinimo;
        this.costoMaximo = costoMaximo;
        this.numeracionDental = numeracionDental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCostoMinimo() {
        return costoMinimo;
    }

    public void setCostoMinimo(float costoMinimo) {
        this.costoMinimo = costoMinimo;
    }
    
    public float getCostoMaximo() {
        return costoMaximo;
    }
        
    public void setCostoMaximo(float costoMaximo) {
        this.costoMaximo = costoMinimo;
}

    public int getNumeracionDental() {
        return numeracionDental;
    }

    public void setNumeracionDental(int numeracionDental) {
        this.numeracionDental = numeracionDental;
    }
    
    public void agregarTratamiento(){
        
    }
}

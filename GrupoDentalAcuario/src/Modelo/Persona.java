package Modelo;

public abstract class Persona {
    protected String nombre;
    protected int CI;
    protected String direccion;
    protected String ciudad ;
    protected String telefono;
    protected int edad;
    protected String genero;
    protected String correo;

    public Persona(String nombre, int CI, String direccion, String ciudad, String telefono, int edad, String genero, String correo) {
        this.nombre = nombre;
        this.CI = CI;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad = Ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}

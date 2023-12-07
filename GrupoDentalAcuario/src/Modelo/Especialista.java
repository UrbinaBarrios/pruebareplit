package Modelo;

import java.util.ArrayList;

public class Especialista extends Empleado{
    private String tipoEspecialidad;
    private ArrayList<Paciente> pacientes;
    private int codigoEspecialista;
    private float gananciasPagadas;
 
    public Especialista(String nombre, int CI, String direccion, String ciudad, String telefono, int edad, String genero, String correo, Horario horario,String tipoEspecialidad, ArrayList<Paciente> pacientes, int codigoEspecialista, float gananciasPagadas) {
        super(nombre,CI,direccion,ciudad,telefono,edad,genero,correo,horario);
        this.tipoEspecialidad = tipoEspecialidad;
        this.pacientes = pacientes;
        this.codigoEspecialista = codigoEspecialista;
        this.gananciasPagadas = gananciasPagadas;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public int getCodigoEspecialista() {
        return codigoEspecialista;
    }

    public void setCodigoEspecialista(int codigoEspecialista) {
        this.codigoEspecialista = codigoEspecialista;
    }

    public float getGananciasPagadas() {
        return gananciasPagadas;
    }

    public void setGananciasPagadas(float gananciasPagadas) {
        this.gananciasPagadas = gananciasPagadas;
    }
    public void indicarTipoEspecialidad(){
        
    }
    public void indicarHorarioAtencion(){
        
    }
    public void indicarCodigoEspecialista(){
        
    }
    public void verPacientes(){
        
    }
    public void verGanancias(){
        
    }
    public void buscarPaciente(){
        
    }
    public void compararPacientes(){
        
    }
    public void validarEspecialista(){
        
    }
    public void modificarEspecialista(){
        
    }
    public void eliminarEspecialista(){
        
    }
    public void anadirEspecialista(){
        
    }
    public void asignarEspecialista(){
        
    }
    public void distribuirGanancias(){
        
    }
    
}

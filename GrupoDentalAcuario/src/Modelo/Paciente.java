
package Modelo;

import java.util.ArrayList;
import java.util.Date;


public class Paciente extends Persona{
    private ArrayList<Cita> citas;
    private Seguro seguro;

    public Paciente(String nombre, int CI, String direccion, String ciudad, String telefono, int edad, String genero, String correo,ArrayList<Cita> citas, Seguro seguro) {
        super(nombre,CI,direccion,ciudad,telefono,edad,genero,correo);
        this.citas = citas;
        this.seguro = seguro;
    }

    public ArrayList<Cita> getCita() {
        return citas;
    }

    public void setCita(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
    
    public void indicarTratamientoRealizado(){
        
    }
    public void indicarFechaCita(){
        
    }
    public void verPacientes(){
        
    }
    public void buscarPaciente(String cedula){
        
    }
    public void marcarCitaCulminada(){
        
    }
    public void seleccionarCita(){
        
    }
    public void calcularCostoTratamiento(){
        
    }
    public void calcularDeducible(){
        
    }
    public void realizarPago(double monto){
        
    }
    public void compararPaciente(){
        
    }
    public void ingresarDatosPaciente(){
        
    }
    public void eliminarPaciente(){
        
    }
    public void obtenerLIstaPacientes(Date fechaInicial, Date fechaFinal){
        
    }
    public void calcularGananciaPorPaciente(){
        
    }
    public void mostratPaientes(){
        
    }
    public void mostrarInformacionPaciente(){
        
    }
}

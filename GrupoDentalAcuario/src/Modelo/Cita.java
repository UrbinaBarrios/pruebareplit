
package Modelo;

import java.util.Date;

public class Cita {
    private Date fecha;
    private String hora;
    private Especialista especialista;
    private String codigoCita;
    private Paciente paciente;
    private Tratamiento tratamiento;
    private Pago pago;

    public Cita() {
    }

    public Cita(Date fecha, Especialista especialista, String codigoCita) {
        this.fecha = fecha;
        this.especialista = especialista;
        this.codigoCita = codigoCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public String getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(String codigoCita) {
        this.codigoCita = codigoCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }


    public void agregarCita(){
        
    }
    public void eliminarCita(){
        
    }
    public void modificarCita(){
        
    }
    public void verCitasDeFecha(Date fecha){
        
    }
    public boolean validarFechaCita(Date fecha){
        return true;
    }
    public void asignarEspecialista(){
        
    }
    public void ingresarDatosPaciente(){
        
    }
    public void modificarFechaCita(){
        
    }
    public void asignarFecha(){
        
    }
    public void seleccionarCita(){
        
    }
    public void buscarCita(Date fecha){
        
    }
}

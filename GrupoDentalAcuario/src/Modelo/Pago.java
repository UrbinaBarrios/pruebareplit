package Modelo;

import java.util.ArrayList;
import java.util.Date;

public abstract class Pago {
    private String tipoPago;
    private float montoDolares;
    private float montoBolivares;
    private float montoTotalDivisas;
    private Factura factura;
    private double dolarActual;
    private ArrayList<Pago> pagosRealizados;

    public Pago() {
    }

    public Pago(String tipoPago, float montoDolares,float montoBolivares, float montoTotalDivisas, Factura factura, double dolarActual, ArrayList<Pago> pagosRealizados) {
        this.tipoPago = tipoPago;
        this.montoDolares = montoDolares;
        this.montoBolivares = montoBolivares;
        this.montoTotalDivisas = montoTotalDivisas;
        this.factura = factura;
        this.dolarActual = dolarActual;
        this.pagosRealizados = pagosRealizados;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public float getMontoDolares() {
        return montoDolares;
    }

    public void setMontoDolares(float montoDolares) {
        this.montoDolares = montoDolares;
    }

    public float getMontoBolivares() {
        return montoBolivares;
    }

    public void setMontoBolivares(float montoBolivares) {
        this.montoBolivares = montoBolivares;
    }

    public float getMontoTotalDivisas() {
        return montoTotalDivisas;
    }

    public void setMontoTotalDivisas(float montoTotalDivisas) {
        this.montoTotalDivisas = montoTotalDivisas;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public double getDolarActual() {
        return dolarActual;
    }

    public void setDolarActual(double dolarActual) {
        this.dolarActual = dolarActual;
    }

    public ArrayList<Pago> getPagosRealizados() {
        return pagosRealizados;
    }

    public void setPagosRealizados(ArrayList<Pago> pagosRealizados) {
        this.pagosRealizados = pagosRealizados;
    }

    
    public void realizarPago(){
        
    }
    public void elegirTipoPago(){
        
    }
    public float calcularPorcentajeTipoPago(){
        return 0;
    }
    public void indicarTratamientoRealizado(){
        
    }
    public void sumarPorcentajes(){
        
    }
    public float calcularPorcentajeGanancia(Date fechaInicial,Date fechaFinal){
        return 0;
    }
  
}

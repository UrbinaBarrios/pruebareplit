
package Modelo;

import java.util.ArrayList;


public class Factura {
    private int numeroFactura;
    private String status;
    private ArrayList<Tratamiento> listaTratamientos;
    private float impuestoIVA;
    private float impuestoIGTF;
    private float montoTotal;

    public Factura() {
    }

    public Factura(int numeroFactura, String status, ArrayList<Tratamiento> listaTratamientos, float impuestoIVA, float impuestoIGTF, float montoTotal) {
        this.numeroFactura = numeroFactura;
        this.status = status;
        this.listaTratamientos = listaTratamientos;
        this.impuestoIVA = impuestoIVA; //aqui en estos impuestos deberia estar el porcentaje predeterminado
        this.impuestoIGTF = impuestoIGTF;
        this.montoTotal = montoTotal;
    }

    
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Tratamiento> getListaTratamientos() {
        return listaTratamientos;
    }

    public void setListaTratamientos(ArrayList<Tratamiento> listaTratamientos) {
        this.listaTratamientos = listaTratamientos;
    }

    public float getImpuestoIVA() {
        return impuestoIVA;
    }

    public void setImpuestoIVA(float impuestoIVA) {
        this.impuestoIVA = impuestoIVA;
    }

    public float getImpuestoIGTF() {
        return impuestoIGTF;
    }

    public void setImpuestoIGTF(float impuestoIGTF) {
        this.impuestoIGTF = impuestoIGTF;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }
    public void realizarPago(){
        
    }
    public String elegirTipoPago(){
        return "";
    }
    
}

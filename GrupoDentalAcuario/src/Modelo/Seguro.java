
package Modelo;

import java.util.ArrayList;


public class Seguro {
    private int polizaSeguro;
    private String nombreCompania;

    public Seguro() {
    }

    public Seguro(int polizaSeguro, String nombreCompania, ArrayList<Tratamiento> informacionTratamientos, Pago deducible) {
        this.polizaSeguro = polizaSeguro;
        this.nombreCompania = nombreCompania;
    }

    
    public int getPolizaSeguro() {
        return polizaSeguro;
    }

    public void setPolizaSeguro(int polizaSeguro) {
        this.polizaSeguro = polizaSeguro;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

}

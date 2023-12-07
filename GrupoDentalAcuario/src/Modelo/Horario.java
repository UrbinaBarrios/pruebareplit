
package Modelo;


public class Horario {
    private int [][] horas;
    private String[][] dias;
    
    public Horario(){
        
    }
    public Horario(int[][] horas, String[][] dias) {
        this.horas = horas;
        this.dias = dias;
    }

    public int[][] getHoras() {
        return horas;
    }

    public void setHoras(int[][] horas) {
        this.horas = horas;
    }

    public String[][] getDias() {
        return dias;
    }

    public void setDias(String[][] dias) {
        this.dias = dias;
    }
    public Horario agregarHorario(){
        Horario horario = new Horario();
        return horario;
    }
    public Horario modificarHorario(){
        Horario horario = new Horario();
        return horario;
    }
    public void eliminarHorario(){
        
    }
    public void asignarHorario(){
        
    }
}

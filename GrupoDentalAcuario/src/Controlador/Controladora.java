package Controlador;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class Controladora {
    JFrame Ventana;

    public Controladora() {
    }
    public void iniciaVentana (JFrame ventana, String logotipo){
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Grupo Dental Acuario");
        ventana.setResizable(false);
        ventana.setIconImage(new ImageIcon(logotipo).getImage());
    }
    public void colocarImagen(JLabel linea, String ruta){
        ImageIcon imagen1 = new ImageIcon(getClass().getResource(ruta));
        ImageIcon LOGO1= new ImageIcon(imagen1.getImage().getScaledInstance(linea.getWidth(),linea.getHeight(),Image.SCALE_DEFAULT));
        linea.setIcon(LOGO1);
    }
    
    public void activaVentana(JFrame v1,JFrame v2){
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
        v1.setTitle("Grupo Dental Acuario");
        v1.setResizable(false);
        v2.dispose();
    }
    public void validarUsuario (JTextField user,JTextField password,JFrame login, JFrame gestionar, JTextField error){
        if (user.getText().equals("")||password.getText().equals("")){
            error.setText("Lo sentimos. Debe llenar todas las casillas"); 
            gestionar.setLocationRelativeTo(null);
            gestionar.setVisible(true);
            login.dispose();
        }else{
            
//            if ((user.getText().equals("Papuh2602"))&&(password.getText().equals("1234"))){
//                error.setText(""); 
//                gestionar.setLocationRelativeTo(null);
//                gestionar.setVisible(true);
//                login.dispose();
//                
//            }else{
//               error.setText("Lo sentimos. Su Usario no ha sido encontrado"); 
//            }
        }
    }
    
    public void iniciarTabla(JTable tablaPacientes){
        String columna[]={"CI","Nombre y Apellido","Teléfono","Edad","Género","Correo","Tipo Pago","Fecha Cita","Especialista","Codigo Cita","Pago"};
        DefaultTableModel md = new DefaultTableModel(null,columna);
        tablaPacientes.setModel(md);
    }
    public void ponerField(JTextField texto){
        Font fuente= texto.getFont();
        fuente= fuente.deriveFont(Font.PLAIN);
        texto.setFont(fuente);
        texto.setForeground(Color.WHITE);
    }
    public void quitarField(JTextField texto){
        Color c=new Color(3,4,94);
        Font fuente= texto.getFont();
        fuente= fuente.deriveFont(Font.ITALIC|Font.BOLD);
        texto.setFont(fuente);
        texto.setForeground(c);
    }
        public void iniciarGestionEspecialistas(JFrame gestionEspecialistas){
        gestionEspecialistas.setVisible(true);
        gestionEspecialistas.setLocationRelativeTo(null);
    }
    public void iniciarVentana(JFrame ventana,JLabel logo, String icono){
        ImageIcon imagen1 = new ImageIcon(getClass().getResource(icono));
            ImageIcon LOGO1 = new ImageIcon(imagen1.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
            logo.setIcon(LOGO1);
        ventana.repaint();
    }
    public void cambiarPestaña(JTabbedPane pestañas, int indice){
        pestañas.setSelectedIndex(indice);
    }
    public void volverAInicio(JFrame ventana, JFrame ventanaNueva){
        ventana.dispose();
        ventanaNueva.setLocationRelativeTo(null);
        ventanaNueva.setVisible(true);
        ventanaNueva.setTitle("Grupo Dental Acuario");
        ventanaNueva.setResizable(false);
    }
}

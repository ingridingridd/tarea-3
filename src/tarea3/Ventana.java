
package tarea3;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana() throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException{
        super();
        PanelPrincipal pp=new PanelPrincipal();
        this.setLayout(new BorderLayout());
        this.setTitle("Expendedor-Comprador");
        this.add(pp);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100,900); 
        this.setVisible(true); 
    }
}

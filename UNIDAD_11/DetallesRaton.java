package UNIDAD_11;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DetallesRaton extends JFrame{
private String detalles; 
private JLabel barraEstado; 
public DetallesRaton(){
super( "Clics y botones del raton");

barraEstado = new JLabel( "Haga clic en el raton" );
add( barraEstado, BorderLayout.SOUTH );
addMouseListener( new AccionClicRaton() ); 
}
    private class AccionClicRaton extends MouseAdapter{
        public void mouseClicked( MouseEvent evento ){
            int xPos = evento.getX(); 
            int yPos = evento.getY();
                detalles = String.format( "Se hizo clic %d vez(veces)",
                    evento.getClickCount() );
                    if ( evento.isMetaDown() ) 
                detalles += " con el boton derecho del raton";
                    else if ( evento.isAltDown() ) 
                detalles += " con el boton central del raton";
                    else 
                detalles += " con el boton izquierdo del raton";
                
                barraEstado.setText( detalles );
        }
   }   
}
        
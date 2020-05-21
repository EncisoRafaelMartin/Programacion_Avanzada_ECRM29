package UNIDAD_11;
import javax.swing.JFrame;

public class MarcoBotonMain {
    public static void main( String args[] ){
        MarcoBoton marcoBoton = new MarcoBoton();
        marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBoton.setSize( 350, 100 );
        marcoBoton.setVisible( true );
    }
}
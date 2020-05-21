package UNIDAD_11;
import javax.swing.JFrame;

public class ListaMain {
    public static void main( String args[] ){
        Lista Lista = new Lista(); // crea objeto MarcoLista
        Lista.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Lista.setSize( 350, 150 ); // establece el tamaño del marco
        Lista.setVisible( true ); // muestra el marco
    }
}
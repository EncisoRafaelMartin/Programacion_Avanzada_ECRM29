package UNIDAD_11.Paneles;
import javax.swing.JFrame;
 public class PanelMain extends JFrame{
    public static void main( String args[] ){
        Panel panel = new Panel();
        panel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        panel.setSize( 450, 200 ); 
        panel.setVisible( true ); 
    }
}
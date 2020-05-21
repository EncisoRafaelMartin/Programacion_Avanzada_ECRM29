package UNIDAD_11.Paneles;
import javax.swing.JFrame;
public class PanelBorderLayoutMain {
    public static void main( String args[] ){
        PanelBorderLayout panelBorderLayout = new PanelBorderLayout();
        panelBorderLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        panelBorderLayout.setSize( 375, 200 ); // establece el tamaño del marco
        panelBorderLayout.setVisible( true );
    }
}
package UNIDAD_11.Paneles;
import javax.swing.JFrame;
public class PanelGridLayoutMain {
    public static void main( String args[] ){
        PanelGridLayout panelGridLayout = new PanelGridLayout();
        panelGridLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        panelGridLayout.setSize( 300, 200 ); 
        panelGridLayout.setVisible( true );
    }
}
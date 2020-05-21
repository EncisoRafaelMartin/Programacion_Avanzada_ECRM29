package UNIDAD_11.Paneles;

import javax.swing.JFrame;

    public class PanelFlowLayoutMain{
        public static void main( String args[] ){
            PanelFlowLayout panelFlowLayout = new PanelFlowLayout();
            panelFlowLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            panelFlowLayout.setSize( 500, 75 ); 
            panelFlowLayout.setVisible( true ); 
        }
    } 
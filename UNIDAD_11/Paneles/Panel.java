package UNIDAD_11.Paneles;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class Panel extends JFrame{
    JPanel panelBotones; 
    
    private JButton botones[]; 
        Panel(){
            super( "Demostracion de Panel" );
            botones = new JButton[ 5 ]; 
            panelBotones = new JPanel(); 
            panelBotones.setLayout( new GridLayout( 1, botones.length ) );
                
                for ( int cuenta = 0; cuenta < botones.length; cuenta++ ){
                    botones[ cuenta ] = new JButton( "Boton " + ( cuenta + 1 ) );
                    panelBotones.add( botones[ cuenta ] );
                } 
            add( panelBotones, BorderLayout.SOUTH ); 
        } 
} 
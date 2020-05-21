package UNIDAD_11.Botones_Imagenes;

import javax.swing.JFrame;

public class BotonesMain{
    public static void main( String args[] ){
        EjemploBoton ejemplobotones = new EjemploBoton();
        ejemplobotones.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ejemplobotones.setSize( 500, 500 );
        ejemplobotones.setVisible( true );
    }
}
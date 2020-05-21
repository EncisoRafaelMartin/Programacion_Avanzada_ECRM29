package UNIDAD_11;

import javax.swing.JFrame;

public class BoxMain {
    public static void main( String args[] ){
        Box box = new Box();
        box.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        box.setSize( 350, 100 );
        box.setVisible( true );
    }
}
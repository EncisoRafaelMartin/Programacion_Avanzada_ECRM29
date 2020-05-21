package UNIDAD_11.Botones_Imagenes;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjemploBoton extends JFrame{
    private JButton botonJButtonSimple;
    private JButton botonJButtonElegante;

    public EjemploBoton(){
        super("Nuevo jbutton");
        setLayout( new FlowLayout() );

        botonJButtonSimple = new JButton( "Boton simple" );
        add( botonJButtonSimple );
         
        Icon sha1 = new ImageIcon( getClass().getResource( "Sharingan.jpg" ) );
        Icon sha2 = new ImageIcon( getClass().getResource( "Sharingan.jpg" ) );
        botonJButtonElegante = new JButton( "Boton elegante", sha1 );
        botonJButtonElegante.setRolloverIcon( sha2 );
        add( botonJButtonElegante );

        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener( manejador );
        botonJButtonSimple.addActionListener( manejador );
    }
    private class ManejadorBoton implements ActionListener{
        public void actionPerformed( ActionEvent evento ){
            JOptionPane.showMessageDialog( EjemploBoton.this, String.format("Usted oprimio: %s", evento.getActionCommand() ) );

        }
    }
}
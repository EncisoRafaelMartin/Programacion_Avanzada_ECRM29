package UNIDAD_11.Texto_Imagen;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Texto_Imagenes extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;

    public Texto_Imagenes()
    {
        super( "Texto e Imagenes" );
        setLayout(new FlowLayout());

        etiqueta1 = new JLabel("Prueba Tarea");
        etiqueta1.setToolTipText("Esta es la etiqueta 1");
        add(etiqueta1);

        Icon vegeta = new ImageIcon(getClass().getResource("vegeta.gif"));
    
        etiqueta2 = new JLabel("figura 1");
        etiqueta2.setIcon(vegeta);
        etiqueta2.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        etiqueta2.setVerticalTextPosition(SwingConstants.EAST);
        etiqueta2.setToolTipText("Esta es la etiqueta2");
        add(etiqueta2);

        etiqueta3 = new JLabel();
        etiqueta3.setText("figura 2");
        etiqueta3.setIcon(vegeta);
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3);
   }
}
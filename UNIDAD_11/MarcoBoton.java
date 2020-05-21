package UNIDAD_11;


import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;


public class MarcoBoton extends JFrame {
    private JTextField campoTexto;
    private Font tipoLetraSimple;
    private Font tipoLetraNegrita;
    private Font tipoLetraCursiva;
    private Font tipoLetraNegritaCursiva;
    private JRadioButton simpleJRadioButton;
    private JRadioButton negritaJRadioButton;
    private JRadioButton cursivaJRadioButton;
    private JRadioButton negritaCursivaJRadioButton;
    private ButtonGroup grupoOpciones;

    public MarcoBoton() {
        super("RadioButton");
        setLayout( new FlowLayout() );
        campoTexto = new JTextField( "Observe el cambio en el estilo del tipo de letra",28 );
        add( campoTexto );

        simpleJRadioButton = new JRadioButton( "Simple", true );
        negritaJRadioButton = new JRadioButton( "Negrita", false );
        cursivaJRadioButton = new JRadioButton( "Cursiva", false );
        negritaCursivaJRadioButton = new JRadioButton( "Negrita/Cursiva", false );
        add( simpleJRadioButton );
        add( negritaJRadioButton );
        add( cursivaJRadioButton );
        add( negritaCursivaJRadioButton );

        grupoOpciones = new ButtonGroup();
        grupoOpciones.add( simpleJRadioButton );
        grupoOpciones.add( negritaJRadioButton );
        grupoOpciones.add( cursivaJRadioButton );
        grupoOpciones.add( negritaCursivaJRadioButton );

        tipoLetraSimple = new Font( "Serif", Font.PLAIN, 14 );
        tipoLetraNegrita = new Font( "Serif", Font.BOLD, 14 );
        tipoLetraCursiva = new Font( "Serif", Font.ITALIC, 14 );
        tipoLetraNegritaCursiva = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
        campoTexto.setFont( tipoLetraSimple );

            simpleJRadioButton.addItemListener(new ManejadorBoton( tipoLetraSimple ) );
            negritaJRadioButton.addItemListener(new ManejadorBoton( tipoLetraNegrita ) );
            cursivaJRadioButton.addItemListener(new ManejadorBoton( tipoLetraCursiva ) );
            negritaCursivaJRadioButton.addItemListener(new ManejadorBoton( tipoLetraNegritaCursiva ) );  
    }
    private class ManejadorBoton implements ItemListener{
        private Font tipoLetra;

        public ManejadorBoton( Font f ){
            tipoLetra = f;
        }
        public void itemStateChanged( ItemEvent evento ){
            campoTexto.setFont(tipoLetra);
        }
    }
}
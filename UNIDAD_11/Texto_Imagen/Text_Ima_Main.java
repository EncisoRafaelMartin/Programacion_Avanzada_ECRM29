package UNIDAD_11.Texto_Imagen;

import javax.swing.JFrame;

public class Text_Ima_Main {
    public static void main(String args[]) {
        Texto_Imagenes panelEtiqueta = new Texto_Imagenes();
        panelEtiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelEtiqueta.setSize(500, 700);
        panelEtiqueta.setVisible(true);
    }
}
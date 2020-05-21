package UNIDAD_11;

import javax.swing.JOptionPane;

public class EntradaSalida {
    public static void main(String args []) {
        String primerNumero = JOptionPane.showInputDialog(" Introduce el prime número");
        String segundoNumero = JOptionPane.showInputDialog("Intoduce el segundo número");

        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + suma);

        String tercerNumero = JOptionPane.showInputDialog("Introduce el primer número");
        String cuartoNumero = JOptionPane.showInputDialog("Introduce el segundo número");

        int numero3 = Integer.parseInt(tercerNumero);
        int numero4 = Integer.parseInt(cuartoNumero);
        
        int resta = numero3 - numero4;

        JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + resta);
        
        String quintoNumero = JOptionPane.showInputDialog("Introduce el primer número");
        String sextoNumero = JOptionPane.showInputDialog("Introduce el segundo número");

        int numero5 = Integer.parseInt(quintoNumero);
        int numero6 = Integer.parseInt(sextoNumero);
     
        if(numero6 == 0){ 
         JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
        }
         else{
         int division = numero5/numero6;
         JOptionPane.showMessageDialog(null,"El resultado de la division es: " + division);
        }

        String septimoNumero = JOptionPane.showInputDialog("Introduce el primer número");
        String octavoNumero = JOptionPane.showInputDialog("Introduce el segundo número");

        int numero7 = Integer.parseInt(septimoNumero);
        int numero8 = Integer.parseInt(octavoNumero);

        int multiplicacion = numero7*numero8;

        JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es: " + multiplicacion);
    }
}
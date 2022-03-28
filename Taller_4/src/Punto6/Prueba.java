
package Punto6;

import javax.swing.JOptionPane;
public class Prueba {
     public static void main(String[] args) {
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));

        Ecuacion a = new Ecuacion(3,2,2);  
        a.mostecu(3, 3, 2, x);
        System.out.printf("Y(%d) = %.2f%n", x, a.eecuacion(x));
        
     
    }
}

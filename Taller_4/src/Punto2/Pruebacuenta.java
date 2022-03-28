
package Punto2;
import javax.swing.JOptionPane;

public class Pruebacuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        
        cuenta1.setNumCuenta(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cuenta ")));
        cuenta1.setNombreCliente(JOptionPane.showInputDialog("Digite el nombre del cliente "));
        cuenta1.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite su saldo")));
        cuenta1.retiro();
        cuenta1.consig(); 
    }
} 
 

package Punto2;
import javax.swing.JOptionPane;
public class Cuenta {
    
    int numCuenta;
    String nombreCliente;
    double saldo, saltotal,dinero;
    char consig, retiro;
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void consig(){
        consig = JOptionPane.showInputDialog("Quiere usted consignar? [S/N]").charAt(0);
        if(consig == 'S' || consig == 's'){
            this.dinero = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidd que desea consignar: "));
                                           JOptionPane.showMessageDialog(null, "Su dinero se ha consignado ");
                                           JOptionPane.showMessageDialog(null, "El monto totalen su cuenta es: "+(saldo+dinero));
                                           JOptionPane.showMessageDialog(null, "------Traite realizado------");
        } 
    }
    
    public void retiro(){
        retiro = JOptionPane.showInputDialog("Quiere usted retirar? [S/N]").charAt(0);
        if(retiro == 'S' || retiro == 's'){
            this.dinero = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));
                                           JOptionPane.showMessageDialog(null, "Se ha realizado su retiro ");
                                           JOptionPane.showMessageDialog(null, "Lo que queda en su cuenta es: "+(saldo-dinero));
                                           JOptionPane.showMessageDialog(null, "------Traite realizado------");
        }
      
    }
    
}

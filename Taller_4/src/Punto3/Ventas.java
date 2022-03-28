
package Punto3;
import javax.swing.JOptionPane;
public class Ventas {
    double[] vent = new double[13]; 
    int conta = 0;
    double mayor = 0; 
    double menor = 0;
    float promedio;
    double resul;
    
    public Ventas(float promedio, double total) {
        this.promedio = promedio;
        this.resul = total;
    }
    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    public double getMayor() {
        return mayor;
    }
    public void setMayor(double mayor) {
        this.mayor = mayor;
    }
    public double getMenor() {
        return menor;
    }
    public void setMenor(double menor) {
        this.menor = menor;
    }
    public double getResul() {
        return resul;
    }
    public void setResul(double resul) {
        this.resul = resul;
    }
    public void ingresarVentas(){
            vent[0] = 750000.00;
            vent[1] = 200000.00;
            vent[2] = 400000.00;
            vent[3] = 360000.00;
            vent[4] = 500000.00;
            vent[5] = 695000.00;
            vent[6] = 300000.00;
            vent[7] = 250000.00;
            vent[8] = 670000.00;
            vent[9] = 400000.00;
            vent[10] = 900000.00;
            vent[11] = 450000.00;
    }
    public void mostrar(){
        for (int i = 0; i < 11; i++) {
            conta = conta + 1;
        }
    }
    public void promedio(){
        for(int e = 0; e < 12; e++){
            promedio += vent[e];
        }
        promedio /= 12;
        JOptionPane.showMessageDialog(null,"El promedio total de ventas es: "+promedio);
    }  
    public void mayor(){
        for(int p = 0; p < 12; p++){
            if(vent[p] > mayor){
                mayor = vent[p];
            }
        }
        JOptionPane.showMessageDialog(null,"La venta mayor del año fue: "+mayor+" pesos en el mes"+conta);
    }   
    public void menor(){
        JOptionPane.showMessageDialog(null,"La venta menor del año fue: "+200000+" pesos en el mes "+2);
    }    
    public void sumatoria(){
        for(int k = 0; k < 12; k++){
            resul += vent[k];
        }
        JOptionPane.showMessageDialog(null,"El total acumulado de las ventas del año es de: "+resul+" pesos");
    } 
}


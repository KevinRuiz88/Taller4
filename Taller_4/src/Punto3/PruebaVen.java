
package Punto3;

public class PruebaVen {
     public static void main(String [] args){
        Ventas ventas1 = new Ventas(0,0);
        ventas1.mostrar();
        ventas1.setMayor(0);
        ventas1.setMenor(0);
        ventas1.setPromedio(0);
        ventas1.ingresarVentas();
        ventas1.promedio();
        ventas1.setResul(0);
        ventas1.mayor();
        ventas1.menor();
        ventas1.sumatoria();
    }
}


package Punto4;

public class PruebaHtc {
      public static void main(String [] args){
        HabitacionM dormitorio = new HabitacionM(3.5f, 3.0f, 3.0f);
        
        System.out.println(">>>>Medidas del dormitorio<<<<");
        System.out.println("Altura del dormitorio: "+dormitorio.alto+" metros");
        System.out.println("Ancho del dormitorio: "+dormitorio.ancho+" metros");
        System.out.println("Largo del domitorio: "+dormitorio.largo+" metros\n");
        
        dormitorio.ccPiso();
        dormitorio.ccParedes();
        
          System.out.println(">>>>Cantidad de materiales<<<<");
        System.out.println("Los metros de enchape que se necesitan para el piso es: "+dormitorio.metros+" m²");
        System.out.println("Los etros de papel que se necesitan para tapizar por completo las paredes son: "+dormitorio.paredes+" m²");
    }
}

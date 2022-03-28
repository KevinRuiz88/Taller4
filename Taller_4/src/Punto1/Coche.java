
package Punto1;

public class Coche {
    //Atributos
    String color;
    String marca;
    String matricula;
    String modelo;
    int numcaballos;
    int numpuertas;
    
    public Coche(String color, String marca, String matricula, String modelo, int numcaballos, int numpuertas){
        this.color = color;
        this.marca = marca;
        this.modelo =modelo;
        this.numcaballos =numcaballos;
        this.numpuertas =numpuertas;
        this.matricula =matricula;
    }
   
    public void MostrarDatos(){
        System.out.println("---------------Informacion del coche-------------");
        System.out.println("El color del coche es: "+color);
        System.out.println("La marca del coche es: "+marca);
        System.out.println("El modelo del coche es: "+modelo);
        System.out.println("El numero de caballos del coche es: "+numcaballos);
        System.out.println("El numero de puertas es: "+numpuertas);
        System.out.println("La matricula del coche es: "+matricula+"\n");
        
    }
}

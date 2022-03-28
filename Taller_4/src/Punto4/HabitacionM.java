
package Punto4;

public class HabitacionM {
     float alto;
    float ancho;
    float largo;
    float metros;
    float paredes;
    
    public HabitacionM(float alto, float largo, float ancho){
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    public void ccPiso(){
        metros = ancho * largo;
    }
    public void ccParedes(){
        paredes = (ancho * largo) * alto;
    }
}

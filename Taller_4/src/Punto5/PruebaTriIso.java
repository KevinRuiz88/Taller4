
package Punto5;


public class PruebaTriIso {
    public static void main(String [] args){
        TrianguloIso triangulo1 = new TrianguloIso(10, 7, 40);
        triangulo1.setBase(6);
        triangulo1.setAltura(11);
        triangulo1.ccArea();
        triangulo1.ccLongitud();
        triangulo1.ccPerimetro();
        triangulo1.ccAngVertice();
    }
}

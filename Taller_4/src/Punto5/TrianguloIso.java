
package Punto5;


public class TrianguloIso {
    float base, altura;
    float aglIguales, aglVertice, ldIguales, ldDiferente;
    float area, longitud, perimetro;

    public TrianguloIso(int ldIguales, int ldDiferente, int aglIguales) {
        this.ldIguales = ldIguales;
        this.ldDiferente = ldDiferente;
        this.aglVertice = aglIguales;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void ccArea(){
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: "+area);
    }
    public void ccLongitud(){
        longitud = ldIguales * 2;
        System.out.println("La longitud del triangulo es: "+longitud);
    }  
    public void ccPerimetro(){
        perimetro = (ldIguales * 2) + ldDiferente;
        System.out.println("El perimetro es: "+perimetro);
    }
    public void ccAngVertice(){
        aglVertice = (aglVertice * 2) - 180;
        System.out.println("Angulo del vertice es: "+aglVertice);
    }
}

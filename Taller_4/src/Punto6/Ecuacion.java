
package Punto6;

public class Ecuacion {
    int a;
    int b;
    int c;
   
    public Ecuacion(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b=b;
    } 
    public void setC(int c){
        this.c=c;
    }   
    public void mostecu(int a, int b, int c,int x){
        System.out.println(a+"*("+x+"^2) + "+b+"*"+x+" + "+c+" = 0");
    }
    public double eecuacion(int x){
        
        double y = this.a * (x * x) + this.b*x + this.c;
        return y;
        
    } 
}


package Punto1;

public class PruebaCoche {
    public static void main(String[] args) {
  
        Coche coche1 = new Coche("rojo", "Renault", "RKE-103", "2018-RF", 220, 4  );
        coche1.MostrarDatos();
        
        Coche coche2 = new Coche("Negro", "BMW", "KRP-456", "2022-JP", 300, 2  );
        coche2.MostrarDatos();
        
        Coche coche3 = new Coche("Blanco", "Mazda", "JRD-479", "2019-HF", 250, 2  );
        coche3.MostrarDatos();
        
        Coche coche4 = new Coche("Gris", "Kia", "LOK-426", "202017-LP", 180, 4  );
        coche4.MostrarDatos();
    }
}

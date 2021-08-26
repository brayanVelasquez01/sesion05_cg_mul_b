
import java.util.Scanner;
public class NewClass
{
	public static void main(String[] args) {
            
            circunferencia circulo = new circunferencia();
            Cuadrado cuadro = new Cuadrado();
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslaciÃ³n 
		// Aplique el vector de traslaciÃ³n anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		System.out.println("ingrese valores");
                Scanner nuevo = new Scanner(System.in);      
	}
}
class Coord {
    private int x, y;
    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
        
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class circunferencia{
    int radio;
    Coord d;

public circunferencia(Coord c, int radio){
    this.d =d;
    this.radio = radio;
}
public circunferencia(){}
}

class Cuadrado {
    private Coord c;
    private int lado;
  
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
        
        
    }
    public Cuadrado(){
    }
    
    public void Traslacion(Coord t) {  // Complete los parÃ¡metros requeridos
        c.setX(t.getX()+c.getX());
        c.setX(t.getY()+c.getY());
    }
    public void Escalado(int x){
        lado = (int)(lado*(1/100.0f));
    }// Complete los parÃ¡metros requeridos
        
        
    public void Rotacion() {  // Complete los parÃ¡metros requeridos
        
    }
} 



    // Implementar los mÃ©todos Traslacion, Escalado y Rotacion para Ã©sta clase




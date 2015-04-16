
public class Cerchio extends Figure{
	int xCentro=0, yCentro=0;
	int raggio=0;


public Cerchio(int x, int y, int r)
{
	super();
	xCentro=x; yCentro=y; raggio=r;
}

// public double Perimetro(int i){ return 2*Math.PI*raggio; }    // da errore in quanto la classe figlio deve rispettare la signature
                                                                 // di tutti i metodi astratti della classe madre, in questo caso il metodo perimetro
                                                                 // che è di tipo double ed non ha parametri

public double Perimetro(){ return 2*Math.PI*raggio; } 

public double Area(){ return Math.PI*raggio*raggio; }

}
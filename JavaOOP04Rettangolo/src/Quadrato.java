
public class Quadrato extends Rettangolo{
	
	public Quadrato(Punto p12, double lato){
		super(p12,lato,lato);
	}
	
	
	//sovrascrivo il metodo perimentro
	public double Perimetro(){      //overrides overriding
	//	return super.Perimetro();
		return 4*base;
	}
	
	
	//sovrascrivo il metodo Area e calcolo l'area Del cubo
	public double Area(){
		
		return 4*super.Area();
	}
}

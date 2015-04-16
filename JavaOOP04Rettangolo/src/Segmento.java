
public class Segmento {
	private Punto p1 = null;
	private Punto p2 = null;
	
	
	//Costruttori
//	public Segmento(int x1 ,int y1 ,int x2, int y2){
//		p1 = new Punto(x1,y1); 
//		p2 = new Punto(x2,y2);		
//	}
//	
//	public Segmento(int x1, int y1){ this(x1,y1,0,0); }
//	
//	public Segmento(){ this(0,0,0,0); }
	
	public Segmento(Punto from, Punto to) {
		this.p1 = from;
		this.p2 = to;
	}

	public Segmento(Punto to) {
		this(new Punto(0,0), to);
	}
	
	public Segmento() {
		this(new Punto(0,0), new Punto(0,0));
	}
	
	
	public double lunghezza(){
		p1.getX();
		p1.getY();
		
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+
				         Math.pow(p1.getY()-p2.getY(), 2));
	}

}

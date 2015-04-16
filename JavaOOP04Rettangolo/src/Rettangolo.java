
public class Rettangolo extends Figure {
	

	private Punto p1 = null;
	private Punto p2 = null;
	protected double base = 0;
	protected double altezza = 0;
	
	public Rettangolo(Punto p12, double b, double h) {
		super();                                      //faccio richiamare il costruttore vuoto della classe madre
		// TODO Auto-generated constructor stub
		this.p1=p12;
		base = b;
		altezza = h;
	}
	
	public Rettangolo()
	{
		this(new Punto(0,0),3,4);
	}
	
	//Con cooordinate del punto in alto a sinistra e quello in basso a destra
	public Rettangolo(Punto p12, Punto p22) {
		// TODO Auto-generated constructor stub
		this(p12,(p22.getX()-p12.getX()),(p22.getY()-p12.getY()));
	}
	
	
	public double Perimetro(){ return 2*(base+altezza); }
	
	public double Area(){ return base*altezza; }
	

}

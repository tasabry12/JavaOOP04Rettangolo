
public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//************* Main 1
//		Punto p1 = new Punto(2,1);
//		Punto p2 = new Punto(0,0);
//		Segmento s = new Segmento(p1,p2);
//		System.out.println(p1.getX());
//		System.out.println("La lunghezza del segmento è :"+s.lunghezza());
//		Rettangolo r = new Rettangolo(p1,3,4);
//		
//		System.out.println("L'area del rettangolo è:"+r.Area());
//		System.out.println("Il perimetro del rettangoloo è:"+r.Perimetro());
//		
//		
//		Rettangolo r1 = new Rettangolo(p1,p2);
//		
//		System.out.println("L'area del rettangolo è:"+r1.Area());
//		System.out.println("Il perimetro del rettangoloo è:"+r1.Perimetro());
//		
//	    Quadrato q = new Quadrato(p1,3);		
//
//		System.out.println("Il perimetro del quadrato è:"+q.Perimetro());		
//		System.out.println("L'area del quadrato è:"+q.Area());
		
		//************* Main 2 - early bindig o Static Binding
//		
//		Figure f = new Quadrato(new Punto(2,1),100); 
//		
//		Figure[] disegno = new Figure[1000];
//		disegno[0] = new Quadrato(new Punto(10,10), 200);
//		disegno[1] = new Quadrato(new Punto(30,10), 50);
//		disegno[2] = new Cerchio(100,100, 70);
//		disegno[3] = new Rettangolo(new Punto(15,10), 150, 89);
//		disegno[4] = new Quadrato(new Punto(30,10), 50);
//		
//		int numeroFigure = 5;
//		double totPerimetri = 0;
//		for (int i=0; i<numeroFigure;i++)
//			if (disegno[i] instanceof Rettangolo)
//				totPerimetri+=((Rettangolo)disegno[i]).Perimetro();
//			else
//				if(disegno[i] instanceof Quadrato)
//					totPerimetri+=((Quadrato)disegno[i]).Perimetro();
//				else
//					if((disegno[i] instanceof Cerchio))
//						totPerimetri+=((Cerchio)disegno[i]).Perimetro();
//		
//		System.out.println(totPerimetri);
		
		//************* Main 3 - static bindig o Dynamic Binding
		
		Figure f = new Quadrato(new Punto(2,1),100); 
		
		Figure[] disegno = new Figure[1000];
		disegno[0] = new Quadrato(new Punto(10,10), 200);
		disegno[1] = new Quadrato(new Punto(30,10), 50);
		disegno[2] = new Cerchio(100,100, 70);
		disegno[3] = new Rettangolo(new Punto(15,10), 150, 89);
		disegno[4] = new Quadrato(new Punto(30,10), 50);
		
		int numeroFigure = 5;
		double totPerimetri = 0;
		
		disegno[0].Perimetro();
		
		for (int i=0; i<numeroFigure;i++)
			totPerimetri+=disegno[i].Perimetro();
		
		System.out.println(totPerimetri);
		
		
	}

}

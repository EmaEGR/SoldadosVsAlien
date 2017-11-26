package PowerUps;

 
import Graficos.FuerzaGrafico;
import Principal.Celda;
import Visitor.Visitor;

public class Fuerza extends MagiaTemporal {
	
	public Fuerza(  ) {
		super();
		this.grafico = new FuerzaGrafico( );		
		
	}

	
	public void accept(Visitor v) {
		System.out.println("Etre aacep fuerza");
	  v.visit(this);
		
	}


	
	
}

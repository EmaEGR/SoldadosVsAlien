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

	 
	public boolean dejoPasar(Visitor v) {
		
		return v.puedoPasar(this);
	}


 
	public boolean puedoAtacar(Visitor v) {
		return v.Atacar(this);
	}
	
	
}

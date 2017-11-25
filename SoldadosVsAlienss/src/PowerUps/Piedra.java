package PowerUps;

import Graficos.PiedraGrafico;
import Visitor.Visitor;

public class Piedra extends ObjetoPrecioso{
	
	
	public Piedra() {
		super();
		grafico = new PiedraGrafico();
	}
	
	public void accept(Visitor v) {		
	}

	public boolean dejoPasar(Visitor v) {
		 
		return false;
	}


	public boolean puedoAtacar(Visitor v) {
		return false;
	}
	
}

package PowerUps;

import Graficos.BombaGrafico;
import Visitor.Visitor;

public class Bomba extends ObjetoPrecioso{
	
	public Bomba() {
		super();
		grafico = new BombaGrafico();
	}

	public void accept(Visitor v) {
	  v.visit(this);
	}
		
	
	
	

}

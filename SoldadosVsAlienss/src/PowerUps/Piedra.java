package PowerUps;

import Graficos.PiedraGrafico;
import Visitor.Visitor;

public class Piedra extends ObjetoPrecioso{
	
	
	public Piedra() {
		super();
		grafico = new PiedraGrafico();
	}
	
	public void accept(Visitor v) {		
		v.visit(this);
	}
	
}

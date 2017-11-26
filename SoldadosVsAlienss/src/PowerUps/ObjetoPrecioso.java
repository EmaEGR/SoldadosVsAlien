package PowerUps;

import Objetos.Obstaculo;
import Principal.Celda;
import Visitor.Visitor;



public abstract class ObjetoPrecioso extends Obstaculo {
		
		 
		
		public ObjetoPrecioso () {
			this.pos = null;
			grafico =null;

		}

		
		 
		public boolean dejoPasar(Visitor v) {
			 
			return v.puedoPasar(this);
		}


		public boolean puedoAtacar(Visitor v) {
			
			return false;
		}
		
		 
		


	
}

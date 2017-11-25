package Factory;

import PowerUps.Bomba;
import PowerUps.ObjetoPrecioso;

public class FactoryBomba implements ObjetoPreciosoMethodFactory {
	
	public ObjetoPrecioso crearObjetoPrecioso() {
		Bomba b = new Bomba();
		return b;
	}

}

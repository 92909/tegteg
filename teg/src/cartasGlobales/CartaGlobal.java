package cartasGlobales;

import java.util.ArrayList;
import java.util.List;

import application.Jugador;

public abstract class CartaGlobal {
	
	public static final List<CartaGlobal> CARTA_GLOBALS = new ArrayList<>();
	
	static {
		for (int i=0; i<20; i++){
			CARTA_GLOBALS.add(new Clasico());
		}
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new VientoAFavor());
		}
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new Nieve());
		}
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new FronterasAbiertas());
		}
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new FronterasCerradas());
		}
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new RefuerzosExtra());
		}
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new Crisis());
		}
		CARTA_GLOBALS.add(new DescansoVerde());
		CARTA_GLOBALS.add(new DescansoNaranja());
		CARTA_GLOBALS.add(new DescansoRojo());
		CARTA_GLOBALS.add(new DescansoAmarillo());
		CARTA_GLOBALS.add(new DescansoAzul());
		CARTA_GLOBALS.add(new DescansoCeleste());
	}

	public int beneficioDefensa() {
		return 0;
	}

	public int beneficioAtaque() {
		return 0;
	}

	public boolean estaDescansando(Jugador jugador) {
		return false;
	}

	public boolean soloIntercontinental() {
		return false;
	}

	public boolean soloContinental() {
		return false;
	}

	public boolean crisis() {
		return false;
	}

	public boolean refuerzosExtra() {
		return false;
	}
}

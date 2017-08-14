package cartasGlobales;

import java.util.ArrayList;
import java.util.List;

import application.Jugador;

public abstract class CartaGlobal {
	
	public static final List<CartaGlobal> CARTA_GLOBALS = new ArrayList<>();

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

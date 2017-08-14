package cartasGlobales;

import java.util.ArrayList;
import java.util.List;

import application.Jugador;

public interface CartaGlobal {
	
	public static final List<CartaGlobal> CARTA_GLOBALS = new ArrayList<>();

	int beneficioDefensa();
	
	int beneficioAtaque();
	
	boolean estaDescansando(Jugador jugador);
	
	boolean soloIntercontinental();
	
	boolean soloContinental();
	
	boolean crisis();
	
	boolean refuerzosExtra();
}

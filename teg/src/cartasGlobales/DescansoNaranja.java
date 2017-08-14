package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoNaranja extends CartaGlobal {

	static {
		CARTA_GLOBALS.add(new DescansoNaranja());
	}
	
	private DescansoNaranja() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "NARANJA".equals(VistaPais.colores[jugador.getNumero()]);
	}

}

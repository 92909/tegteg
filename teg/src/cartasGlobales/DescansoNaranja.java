package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoNaranja extends CartaGlobal {
	
	DescansoNaranja() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "NARANJA".equals(VistaPais.colores[jugador.getNumero()]);
	}

}

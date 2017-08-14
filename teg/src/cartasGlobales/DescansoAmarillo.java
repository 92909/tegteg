package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoAmarillo extends CartaGlobal {
	
	DescansoAmarillo() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "AMARILLO".equals(VistaPais.colores[jugador.getNumero()]);
	}

}

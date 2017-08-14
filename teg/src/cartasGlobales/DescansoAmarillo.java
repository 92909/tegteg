package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoAmarillo extends CartaGlobal {

	static {
		CARTA_GLOBALS.add(new DescansoAmarillo());
	}
	
	private DescansoAmarillo() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "AMARILLO".equals(VistaPais.colores[jugador.getNumero()]);
	}

}

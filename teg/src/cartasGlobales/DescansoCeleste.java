package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoCeleste extends CartaGlobal {

	static {
		CARTA_GLOBALS.add(new DescansoCeleste());
	}
	
	private DescansoCeleste() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "CELESTE".equals(VistaPais.colores[jugador.getNumero()]);
	}

}

package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoCeleste extends CartaGlobal {
	
	DescansoCeleste() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "CELESTE".equals(VistaPais.colores[jugador.getNumero()]);
	}

}

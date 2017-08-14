package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoRojo extends CartaGlobal {
	
	DescansoRojo() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "ROJO".equals(VistaPais.colores[jugador.getNumero()]);
	}

}

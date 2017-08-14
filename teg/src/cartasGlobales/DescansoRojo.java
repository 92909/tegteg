package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoRojo extends CartaGlobal {

	static {
		CARTA_GLOBALS.add(new DescansoRojo());
	}
	
	private DescansoRojo() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "ROJO".equals(VistaPais.colores[jugador.getNumero()]);
	}

}

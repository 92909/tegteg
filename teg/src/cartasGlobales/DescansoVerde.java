package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoVerde implements CartaGlobal {

	static {
		CARTA_GLOBALS.add(new DescansoVerde());
	}
	
	private DescansoVerde() {
	}
	
	@Override
	public int beneficioDefensa() {
		return 0;
	}

	@Override
	public int beneficioAtaque() {
		return 0;
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "VERDE".equals(VistaPais.colores[jugador.getNumero()]);
	}

	@Override
	public boolean soloIntercontinental() {
		return false;
	}

	@Override
	public boolean soloContinental() {
		return false;
	}

	@Override
	public boolean crisis() {
		return false;
	}

	@Override
	public boolean refuerzosExtra() {
		return false;
	}

}

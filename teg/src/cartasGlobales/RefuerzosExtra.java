package cartasGlobales;

import application.Jugador;

public final class RefuerzosExtra implements CartaGlobal {

	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new RefuerzosExtra());
		}
	}
	
	private RefuerzosExtra() {
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
		return false;
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
		return true;
	}

}

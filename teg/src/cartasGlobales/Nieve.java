package cartasGlobales;

public final class Nieve extends CartaGlobal {
	
	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new Nieve());
		}
	}
	
	private Nieve() {
	}

	@Override
	public int beneficioDefensa() {
		return 1;
	}

}

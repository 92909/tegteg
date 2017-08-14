package cartasGlobales;

public final class FronterasCerradas extends CartaGlobal {

	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new FronterasCerradas());
		}
	}
	
	private FronterasCerradas() {
	}

	@Override
	public boolean soloContinental() {
		return true;
	}

}

package cartasGlobales;

public final class RefuerzosExtra extends CartaGlobal {

	static {
		for (int i=0; i<4; i++){
			CARTA_GLOBALS.add(new RefuerzosExtra());
		}
	}
	
	private RefuerzosExtra() {
	}

	@Override
	public boolean refuerzosExtra() {
		return true;
	}

}

package cartasGlobales;

public final class Clasico extends CartaGlobal {
	
	static {
		for (int i=0; i<20; i++){
			CARTA_GLOBALS.add(new Clasico());
		}
	}
	
	private Clasico() {
	}

}

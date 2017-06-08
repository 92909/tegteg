package application;

public class Enfrentamiento {
	
	Pais a;
	Pais d;
	 
	Carta c;

	public Enfrentamiento(Pais pais, Pais pais2, Carta carta) {
		 a = pais;
		 d = pais2;
		c=carta;
		
	}

	public int[] getEjercitoAtaque() throws Exception {
		int[] f;
		if (a.cantidadDeFichas >3){
			 f = new int[3+c.vientoAFavor()];
			 
		}else if( a.cantidadDeFichas >1){
			 f = new int[a.cantidadDeFichas-1+c.vientoAFavor() ];
		}else{
			throw new Exception();
		}
		return f;
	}

	public int[] getEjercitoDefensa() throws Exception {
		int[] f;
		if (d.cantidadDeFichas > 3){
			 f = new int[3+c.nieve()];
		}else if( d.cantidadDeFichas >= 1){
			 f = new int[d.cantidadDeFichas+c.nieve()];
		}else{
			throw new Exception();
		}
		return f;
	}

	public Object pelear() {
		
		return null;
	}

	
		 
		
	

	public Pais getPaisDefensa() {
		
		return d;
	}

	public Pais getPaisAtaque() {
		
		return a;
	}

	public Object getBatalla() {
		
		
		return null;
	}



}

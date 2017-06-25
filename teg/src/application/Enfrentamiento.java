package application;

public class Enfrentamiento {
	
	Pais a;
	Pais d;
	Batalla batalla;
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
		
		tirarDados(f);
		
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
		
		tirarDados(f);
		
		return f;
	}

	private void tirarDados(int[] v) {
		for (int i=0; i<v.length; i++){
			v[i] = Dado.tirar();
		}
		
	}

	public int pelear() throws Exception {
		
		if (a.j.equals(d.j)){
			throw new Exception("no se puede. mismo jugador");
		}
		
		if (!a.limita(d)){
			throw new Exception("no limita");
		}
		
		batalla = new Batalla(getEjercitoAtaque(), getEjercitoDefensa());
		d.cantidadDeFichas -= batalla.batallar();
		a.cantidadDeFichas -= batalla.cantBatallas()-batalla.batallar();
		
		if (d.cantidadDeFichas == 0){
			a.tranferir(d, 1);
		}
		return batalla.batallar();
	}

	
		 
		
	

	public Pais getPaisDefensa() {
		
		return d;
	}

	public Pais getPaisAtaque() {
		
		return a;
	}

	public Batalla getBatalla() {
		
		
		return batalla;
	}



}

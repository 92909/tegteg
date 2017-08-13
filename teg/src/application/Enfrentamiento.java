package application;

public class Enfrentamiento {
	
	public VistaPais a;
	public VistaPais d;
	Batalla batalla;
	Carta c;
	int carta=0;

	public Enfrentamiento(VistaPais pais, VistaPais pais2, Carta carta) {
		a = pais;
		d = pais2;
		c=carta;
		
	}

	public int[] getEjercitoAtaque() throws Exception {
		int[] f;
		if (a.pais.cantidadDeFichas >3){
			 f = new int[3+c.vientoAFavor()];
			 
		}else if( a.pais.cantidadDeFichas >1){
			 f = new int[a.pais.cantidadDeFichas-1+c.vientoAFavor() ];
		}else{
			throw new Exception("no hay fichas");
		}
		
		tirarDados(f);
		
		return f;
	}

	public int[] getEjercitoDefensa() throws Exception {
		int[] f;
		if (d.pais.cantidadDeFichas > 3){
			 f = new int[3+c.nieve()];
		}else if( d.pais.cantidadDeFichas >= 1){
			 f = new int[d.pais.cantidadDeFichas+c.nieve()];
		}else{
			throw new Exception("no hay fichas");
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
		
		if (a.pais.j.equals(d.pais.j)){
			throw new Exception("no se puede. mismo jugador");
		}
		
		if (!a.pais.limita(d.pais)){
			throw new Exception("no limita");
		}
		if(Main.turno!=a.pais.j.numero) {
			throw new Exception("no es su turno");
		}
		
		batalla = new Batalla(getEjercitoAtaque(), getEjercitoDefensa());
		d.pais.cantidadDeFichas -= batalla.batallar();
		a.pais.cantidadDeFichas -= batalla.cantBatallas()-batalla.batallar();
		
		if (d.pais.cantidadDeFichas == 0){
			a.pais.tranferir(d.pais, 1);
			d.pais.setJugador(a.pais.j);
			d.setColor(d.pais.j);
			carta=1;
		}
		return batalla.batallar();
	}

	
		 
		
	

	public VistaPais getPaisDefensa() {
		
		return d;
	}

	public VistaPais getPaisAtaque() {
		
		return a;
	}

	public Batalla getBatalla() {
		
		
		return batalla;
	}



}

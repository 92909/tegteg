package application;

import java.util.ArrayList;

public class Pais {
	static Pais ARGENTINA = new Pais("Argentina", 10);
	static Pais BRASIL = new Pais("Brasil", 10);
	static Pais URUGUAY = new Pais("Uruguay", 10);
	static Pais PARAGUAY = new Pais("Paraguay", 10);
	static Pais COLOMBIA = new Pais("Colombia", 10);
	static Pais CHILE= new Pais("Chile", 10);
	static Pais BOLIVIA = new Pais("Bolivia", 10);
	static Pais  VENEZUELA= new Pais("Venezuela", 10);
	
	static Pais NICARAGUA = new Pais("Nicaragua", 10);
	static Pais ELSALVADOR = new Pais("El Salvador", 10);
	static Pais JAMAICA = new Pais("Jamaica", 10);
	static Pais HONDURAS = new Pais("Honduras", 10);
	static Pais CUBA = new Pais("Cuba", 10);
	static Pais MEXICO = new Pais("	Mexico", 10);
	
	static Pais CALIFORNIA = new Pais("Paraguay", 10);
	static Pais FLORIDA= new Pais("Paraguay", 10);
	static Pais LASVEGAS = new Pais("Paraguay", 10);
	static Pais CHICAGO = new Pais("Paraguay", 10);
	static Pais OREGON = new Pais("Paraguay", 10);
	static Pais TERRNOVA = new Pais("Paraguay", 10);
	static Pais CANADA = new Pais("Paraguay", 10);
	static Pais NUEVAYORK = new Pais("Paraguay", 10);
	static Pais ALASKA = new Pais("Paraguay", 10);
	static Pais ISLAVICTORIA = new Pais("Paraguay", 10);
	static Pais LABRADOR = new Pais("Paraguay", 10);
	static Pais GREOLANDIA = new Pais("Paraguay", 10);
	
	static Pais ISLANDIA = new Pais("Paraguay", 10);
	static Pais IRLANDA = new Pais("Paraguay", 10);
	static Pais PORTUGAL = new Pais("Paraguay", 10);
	static Pais ESPA�A = new Pais("Paraguay", 10);
	static Pais GRANBRETA�A = new Pais("Paraguay", 10);
	static Pais NORUEGA = new Pais("Paraguay", 10);
	static Pais FINLANDIA = new Pais("Paraguay", 10);
	static Pais BIELORUSIA= new Pais("Paraguay", 10);
	static Pais UCRANIA = new Pais("Paraguay", 10);
	static Pais ALBANIA = new Pais("Paraguay", 10);
	static Pais POLONIA = new Pais("Paraguay", 10);
	static Pais SERBIA = new Pais("Paraguay", 10);
	static Pais CROACIA = new Pais("Paraguay", 10);
	static Pais ALEMANIA = new Pais("Paraguay", 10);
	static Pais FRANCIA = new Pais("Paraguay", 10);
	static Pais ITALIA = new Pais("Paraguay", 10);
	
	static Pais IRAK = new Pais("Paraguay", 10);
	static Pais IRAN = new Pais("Paraguay", 10);
	static Pais RUSIA = new Pais("Paraguay", 10);
	static Pais CHECHENIA = new Pais("Paraguay", 10);
	static Pais SIBERIA = new Pais("Paraguay", 10);
	static Pais ARABIA = new Pais("Paraguay", 10);
	static Pais ISRAEL = new Pais("Paraguay", 10);
	static Pais  TURQUIA= new Pais("Paraguay", 10);
	static Pais CHINA = new Pais("Paraguay", 10);
	static Pais CHURCHIL = new Pais("Paraguay", 10);
	static Pais INDIA = new Pais("Paraguay", 10);
	static Pais MALASIA = new Pais("Paraguay", 10);
	static Pais COREA = new Pais("Paraguay", 10);
	static Pais KAMCHATKA = new Pais("Paraguay", 10);
	static Pais JAPON = new Pais("Paraguay", 10);
	static Pais VIETNAM = new Pais("Paraguay", 10);
	
	
	String nombre;
	int cantidadDeFichas;
	ArrayList<Pais> paisesLim=new ArrayList<Pais>();
	Jugador j;

	public Pais(int i) {
		nombre = "pais";
		cantidadDeFichas = i;
	}
	
	public Pais(String nombre, int i) {
		this.nombre = nombre;
		cantidadDeFichas = i;
	}

	public Pais() {
		cantidadDeFichas=1;
		nombre = "pais";
	}

	public int getCantFichas() {
		return cantidadDeFichas;
	}

	public void ponerFichas(int i) {
		cantidadDeFichas=cantidadDeFichas+i;
		// TODO Auto-generated method stub
		
	}

	public void sacarFichas(int i) {
		cantidadDeFichas=cantidadDeFichas-i;
		// TODO Auto-generated method stub
		
	}

	public void tranferir(Pais pais2, int i) {
		this.cantidadDeFichas-=i;
		pais2.cantidadDeFichas+=i;
		// TODO Auto-generated method stub
		
	}

	public boolean limita(Pais pais2) {
		
		return paisesLim.contains(pais2);
	}

	public void agregarLimite(Pais pais2) {
		
		paisesLim.add(pais2);
		pais2.paisesLim.add(this);
		
		
	}

	public void setJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		
	}

	public Jugador  getJugador() {
		// TODO Auto-generated method stub
		return j;
	}

}

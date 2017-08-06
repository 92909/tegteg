package application;

import java.util.ArrayList;
import java.util.Random;

public class Pais {
	//AMERICA DEL SUR
	static Pais ARGENTINA = new Pais("Argentina", 10);
	static Pais BRASIL = new Pais("Brasil", 10);
	static Pais URUGUAY = new Pais("Uruguay", 10);
	static Pais PARAGUAY = new Pais("Paraguay", 10);
	static Pais COLOMBIA = new Pais("Colombia", 10);
	static Pais CHILE = new Pais("Chile", 10);
	static Pais BOLIVIA = new Pais("Bolivia", 10);
	static Pais VENEZUELA = new Pais("Venezuela", 10);
	//AMERICA CENTRAL
	static Pais NICARAGUA = new Pais("Nicaragua", 10);
	static Pais ELSALVADOR = new Pais("El Salvador", 10);
	static Pais JAMAICA = new Pais("Jamaica", 10);
	static Pais HONDURAS = new Pais("Honduras", 10);
	static Pais CUBA = new Pais("Cuba", 10);
	static Pais MEXICO = new Pais("	Mexico", 10);
	//AMERICA DEL NORTE
	static Pais CALIFORNIA = new Pais("Paraguay", 10);
	static Pais FLORIDA = new Pais("Paraguay", 10);
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
	//EUROPA
	static Pais ISLANDIA = new Pais("Paraguay", 10);
	static Pais IRLANDA = new Pais("Paraguay", 10);
	static Pais PORTUGAL = new Pais("Paraguay", 10);
	static Pais ESPAÑA = new Pais("Paraguay", 10);
	static Pais GRANBRETAÑA = new Pais("Paraguay", 10);
	static Pais NORUEGA = new Pais("Paraguay", 10);
	static Pais FINLANDIA = new Pais("Paraguay", 10);
	static Pais BIELORUSIA = new Pais("Paraguay", 10);
	static Pais UCRANIA = new Pais("Paraguay", 10);
	static Pais ALBANIA = new Pais("Paraguay", 10);
	static Pais POLONIA = new Pais("Paraguay", 10);
	static Pais SERBIA = new Pais("Paraguay", 10);
	static Pais CROACIA = new Pais("Paraguay", 10);
	static Pais ALEMANIA = new Pais("Paraguay", 10);
	static Pais FRANCIA = new Pais("Paraguay", 10);
	static Pais ITALIA = new Pais("Paraguay", 10);
	//ASIA
	static Pais IRAK = new Pais("Paraguay", 10);
	static Pais IRAN = new Pais("Paraguay", 10);
	static Pais RUSIA = new Pais("Paraguay", 10);
	static Pais CHECHENIA = new Pais("Paraguay", 10);
	static Pais SIBERIA = new Pais("Paraguay", 10);
	static Pais ARABIA = new Pais("Paraguay", 10);
	static Pais ISRAEL = new Pais("Paraguay", 10);
	static Pais TURQUIA = new Pais("Paraguay", 10);
	static Pais CHINA = new Pais("Paraguay", 10);
	static Pais CHURCHIL = new Pais("Paraguay", 10);
	static Pais INDIA = new Pais("Paraguay", 10);
	static Pais MALASIA = new Pais("Paraguay", 10);
	static Pais COREA = new Pais("Paraguay", 10);
	static Pais KAMCHATKA = new Pais("Paraguay", 10);
	static Pais JAPON = new Pais("Paraguay", 10);
	static Pais VIETNAM = new Pais("Paraguay", 10);
	//OCEANIA
	static Pais AUSTRALIA = new Pais("Australia", 10);
	static Pais NUEVA_ZELANDIA = new Pais("Nueva Zelandia", 10);
	static Pais TASMANIA = new Pais("Tasmania", 10);
	static Pais SUMATRA = new Pais("Sumatra", 10);
	static Pais FILIPINAS = new Pais("Filipinas", 10);
	static Pais TONGA = new Pais("Tonga", 10);
	//AFRICA
	static Pais SUDAFRICA = new Pais("Sudafrica", 10);
	static Pais MAURITANIA = new Pais("Mauritania", 10);;

	static {
		ARGENTINA.agregarLimite(BRASIL);
		ARGENTINA.agregarLimite(URUGUAY);
		ARGENTINA.agregarLimite(BOLIVIA);
		ARGENTINA.agregarLimite(CHILE);
		ARGENTINA.agregarLimite(PARAGUAY);
		CHILE.agregarLimite(COLOMBIA);
		CHILE.agregarLimite(BOLIVIA);
		CHILE.agregarLimite(BRASIL);
		URUGUAY.agregarLimite(BRASIL);
		URUGUAY.agregarLimite(PARAGUAY);
		BOLIVIA.agregarLimite(BRASIL);
		BOLIVIA.agregarLimite(PARAGUAY);
		BRASIL.agregarLimite(VENEZUELA);
		BRASIL.agregarLimite(COLOMBIA);
		COLOMBIA.agregarLimite(VENEZUELA);
		NUEVA_ZELANDIA.agregarLimite(TASMANIA);
		TASMANIA.agregarLimite(AUSTRALIA);
		AUSTRALIA.agregarLimite(SUMATRA);
		AUSTRALIA.agregarLimite(FILIPINAS);
		AUSTRALIA.agregarLimite(TONGA);
		AUSTRALIA.agregarLimite(CHILE);
		SUMATRA.agregarLimite(INDIA);
		FILIPINAS.agregarLimite(VIETNAM );
		TONGA.agregarLimite(CALIFORNIA);
	}

	String nombre;
	int cantidadDeFichas;
	ArrayList<Pais> paisesLim = new ArrayList<Pais>();
	Jugador j;
	int misiles;
	static int cantidadDeJugadores;
	String escudo="";

	public Pais(int i) {
		nombre = "pais";
		cantidadDeFichas = i;
	}

	public Pais(String nombre, int i) {
		this.nombre = nombre;
		cantidadDeFichas = i;
		misiles = 2;
	}

	public Pais() {
		cantidadDeFichas = 1;
		nombre = "pais";
	}

	public int getCantFichas() {
		return cantidadDeFichas;
	}

	public void ponerFichas(int i) {
		cantidadDeFichas = cantidadDeFichas + i;
		// TODO Auto-generated method stub

	}

	public void sacarFichas(int i) {
		cantidadDeFichas = cantidadDeFichas - i;
		// TODO Auto-generated method stub

	}

	public void tranferir(Pais pais2, int i) {
		this.cantidadDeFichas -= i;
		pais2.cantidadDeFichas += i;
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
		j = jugador;

	}

	public Jugador getJugador() {
		// TODO Auto-generated method stub
		return j;
	}

	public int distancia(Pais pais) throws Exception {

		if (this.equals(pais)){
			return 0;
		}
		
		if (paisesLim.contains(pais)){
			return 1;
		}
		
		for (Pais lim : paisesLim){
			if (lim.paisesLim.contains(pais)){
				return 2;
			}
		}
		
		for (Pais lim : paisesLim){
			for (Pais limlim: lim.paisesLim){
				if (limlim.paisesLim.contains(pais)){
					return 3;
				}
			}
		}
		throw new Exception("muy lejos");
	}

	public int tirarMisil(Pais pais) throws Exception {
		if (this.j.equals(pais.j)){
			throw new Exception("no se puede. mismo jugador");
		}
		
		if (misiles == 0){
			throw new Exception("no hay misiles");
		}
		misiles --;
		
		if (pais.cantidadDeFichas > 3-distancia(pais)+1){
			pais.cantidadDeFichas -= 3-distancia(pais)+1;			
		}else{
			throw new Exception("no se puede matar un pais");
		}
		return 3-distancia(pais)+1;
	}
	public void repartir(int cantidadDeJugadores) {
		this.cantidadDeJugadores=cantidadDeJugadores;
		ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
		for(int i=0;i<cantidadDeJugadores;i++) {
			jugadores.add(new Jugador(i));
		}
		ArrayList<Pais> lista=new ArrayList<Pais>();
		lista.add(ALASKA);lista.add(ALBANIA);lista.add(ALEMANIA);lista.add(ARABIA);lista.add(ARGENTINA);lista.add(AUSTRALIA);
		lista.add(BIELORUSIA);lista.add(BOLIVIA);lista.add(BRASIL);lista.add(CALIFORNIA);lista.add(CANADA);lista.add(CHECHENIA);
		lista.add(CHICAGO);lista.add(CHILE);lista.add(CHINA);lista.add(CHURCHIL);lista.add(COLOMBIA);lista.add(COREA);lista.add(CROACIA);
		lista.add(CUBA);lista.add(ELSALVADOR);lista.add(ESPAÑA);lista.add(FINLANDIA);lista.add(FLORIDA);lista.add(FRANCIA);lista.add(GRANBRETAÑA);
		lista.add(GREOLANDIA);lista.add(HONDURAS);lista.add(INDIA);lista.add(IRAK);lista.add(IRAN);lista.add(IRLANDA);lista.add(ISLANDIA);lista.add(ISLAVICTORIA);
		lista.add(ISRAEL);lista.add(ITALIA);lista.add(JAMAICA);lista.add(JAPON);lista.add(KAMCHATKA);lista.add(LABRADOR);lista.add(LASVEGAS);
		lista.add(MALASIA);lista.add(MEXICO);lista.add(NICARAGUA);lista.add(NORUEGA);lista.add(NUEVA_ZELANDIA);lista.add(NUEVAYORK);
		lista.add(OREGON);lista.add(PARAGUAY);lista.add(POLONIA);lista.add(PORTUGAL);lista.add(RUSIA);lista.add(SERBIA);lista.add(SIBERIA);
		lista.add(TASMANIA);lista.add(TERRNOVA);lista.add(TURQUIA);lista.add(UCRANIA);lista.add(URUGUAY);lista.add(VENEZUELA);
		lista.add(VIETNAM);
		Random r=new Random();
		
		for(int i=0;i<lista.size();i++) {
			for(int j=0;j<lista.size();j++) {
				int f=r.nextInt(2);
				if(f==0) {
				Pais aux=lista.get(i);
				lista.set(i,lista.get(j));
				lista.set(j,aux);
				}
			}
			
			
		}
		
	for(int i=0;i<lista.size();i++) {
		lista.get(i).j=jugadores.get(i%jugadores.size());
	}
		
		
	}


}

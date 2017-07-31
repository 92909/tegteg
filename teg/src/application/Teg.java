package application;

import java.util.ArrayList;
import java.util.List;

public class Teg {

	List<VistaPais> paises = new ArrayList<>();
	VistaPais pais1;
	VistaPais pais2;
	int cantidadDeJugadores=2;
	
	public Teg() {
		paises.add(new VistaPais(100, 100, Pais.AUSTRALIA, "/VERDE/AUSTRALIA.png", 1224, 837));
		paises.add(new VistaPais(100, 200, Pais.SUMATRA, "/NARANJA/SUMATRA.png", 1212, 770));
		paises.add(new VistaPais(300, 100, Pais.FILIPINAS, "/CELESTE/FILIPINAS.png", 1340, 750));
		paises.add(new VistaPais(300, 200, Pais.TONGA, "/AZUL/TONGA.png", 1486, 799));
		paises.add(new VistaPais(200, 300, Pais.TASMANIA, "/ROJO/TASMANIA.png", 1343, 1037));
		paises.add(new VistaPais(200, 300, Pais.NUEVA_ZELANDIA, "/AMARILLO/NUEVA_ZELANDIA.png", 1233, 1074));
		
		paises.add(new VistaPais(200, 300, Pais.ARABIA, "/AZUL/ARABIA.png", 1129, 628));
		paises.add(new VistaPais(200, 300, Pais.CHECHENIA, "/ROJO/CHECHENIA.png", 1168, 136));
		paises.add(new VistaPais(200, 300, Pais.CHINA, "/AMARILLO/CHINA.png", 1229, 29));
		paises.add(new VistaPais(200, 300, Pais.CHURCHIL, "/NARANJA/CHUKCHI.png", 1287, 69));
		paises.add(new VistaPais(200, 300, Pais.COREA, "/CELESTE/COREA.png", 1326, 327));
//		paises.add(new VistaPais(200, 300, Pais.IRAK, "/CELESTE/IRAK.png", 1056, 444));
		
		paises.add(new VistaPais(200, 100, Pais.MAURITANIA, "/AMARILLO/MADAGASCAR.png", 1004, 862));
		paises.add(new VistaPais(200, 100, Pais.SUDAFRICA, "/VERDE/SUDAFRICA.png", 908, 907));
		paises.add(new VistaPais(300, 300, Pais.MAURITANIA, "/AZUL/MAURITANIA.png", 934, 863));
		
		ArrayList<Jugador>jugadores=new ArrayList<Jugador>();
		
		for(int i=0;i<cantidadDeJugadores;i++){
			
			jugadores.add(new Jugador(i));
			
			
			
		}
		
		for(int i=0;i<paises.size();i++){
			
			paises.get(i).pais.j = jugadores.get(i%jugadores.size());
			
			
			paises.get(i).setColor(jugadores.get(i%jugadores.size()));
			
		}
		
	}

	public List<int[]> jugar() throws Exception {
		Enfrentamiento enfrentamiento = new Enfrentamiento(pais1, pais2, new Carta("clasico"));
		enfrentamiento.pelear();
		List<int[]> list = new ArrayList<>();
		list.add(enfrentamiento.batalla.jugador1);
		list.add(enfrentamiento.batalla.jugador2);
		return list;
		
	}

	public int tirarMisil() throws Exception {
		return pais1.pais.tirarMisil(pais2.pais);
		
	}
}

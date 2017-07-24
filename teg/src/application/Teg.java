package application;

import java.util.ArrayList;
import java.util.List;

public class Teg {

	List<VistaPais> paises = new ArrayList<>();
	VistaPais pais1;
	VistaPais pais2;
	int cantidadDeJugadores=2;
	
	public Teg() {
		paises.add(new VistaPais(100, 100, Pais.NUEVA_ZELANDIA, "OCEANIA/AZUL/NUEVA_ZELANDIA.png", 1235, 1082));
		paises.add(new VistaPais(200, 100, Pais.AUSTRALIA, "OCEANIA/AZUL/AUSTRALIA.png", 1244,849 ));
		paises.add(new VistaPais(100, 200, Pais.ALASKA, "AMERICA_DEL_NORTE/AMARILLO/ALASKA.png", 48, 58));
		paises.add(new VistaPais(200, 200, Pais.TAZMANIA, "OCEANIA/ROJO/TASMANIA.png", 1346, 1044));
		paises.add(new VistaPais(300, 100, Pais.ARGENTINA, "AMERICA_DEL_SUR/NORMALES/arg.png", 290, 952));
		paises.add(new VistaPais(300, 200, Pais.BOLIVIA, "OCEANIA/AZUL/NUEVA_ZELANDIA.png", 1235, 1082));
		paises.add(new VistaPais(300, 300, Pais.VENEZUELA, "OCEANIA/AZUL/NUEVA_ZELANDIA.png", 1235, 1082));
		paises.add(new VistaPais(200, 300, Pais.COLOMBIA, "OCEANIA/ROJO/NUEVA_ZELANDIA.png", 1235, 1082));
		
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

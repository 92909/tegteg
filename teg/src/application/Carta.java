package application;

public class Carta {
	String nombre;
	public Carta(String string) {
		nombre=string;
	}
	
	public int vientoAFavor(){
		if(nombre.equals("vientoAFavor")){
			return 1;
		}
		return 0;
	}
	public int nieve(){
		if(nombre.equals("nieve")){
			return 1;
		}
		return 0;
	}


	
	

}

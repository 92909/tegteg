package application;

public class Turno {
	
	Enfrentamiento e;
	Reagrupamiento r;
	public Turno(){
		
	}
	public void enfrentar(VistaPais pais1,VistaPais pais2,Carta carta){
		e=new Enfrentamiento(pais1,pais2,carta);
	}
	public void reagrupar(){
		r=new Reagrupamiento();
	}
	public void tomarCarta(){
		
	}
	public void crearTurno(VistaPais pais1,VistaPais pais2,Carta carta){
		do{
			this.enfrentar(pais1,pais2,carta);
		}while("reagrupar"!=button.getValue);
		this.reagrupar();
		this.tomarCarta();
	}
	
	

}

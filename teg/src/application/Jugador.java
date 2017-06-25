package application;


import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Jugador  {
	String nombre;
	Color color;
	public Jugador(int i) {
		
	}
	public Jugador(Color c) {
		color=c;
	}

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void atacar(Pais pais, Pais pais2) {
		Enfrentamiento e=new Enfrentamiento(pais,pais2,new Carta("Clasico"));
		
	}


	
	

}

package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class VistaPais {

	Pais pais;
	
	Circle circle;
	
	Text nombre;
	
	Text fichas;
	
	public VistaPais(int centroX, int centroY, Pais pais) {
		this.pais = pais;
		circle = new Circle(centroX, centroY, 10);
		circle.setFill(Color.RED);
		nombre = new Text(centroX-10, centroY-10, pais.nombre);
		fichas = new Text(centroX, centroY, String.valueOf(pais.cantidadDeFichas));
	}
}

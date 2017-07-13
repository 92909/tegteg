package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class VistaPais {
	
	static String[] colores = {"NORMALES", "AMARILLO", "AZUL", "CELESTE", "NARANJA", "ROJO", "VERDE"};

	Pais pais;
	
	ImageView imagen;
	
	Text nombre;
	
	Text fichas;
	
	Text misiles;
	
	private String ruta;
	
	public VistaPais(int centroX, int centroY, Pais pais) {
		this.pais = pais;
		try {
			ruta = "AMERICA_DEL_SUR\\NORMALES\\arg.png";
			imagen = new ImageView(new Image(new FileInputStream(ruta)));
			imagen.setX(centroX);
			imagen.setY(centroY);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		nombre = new Text(centroX-50, centroY-50, pais.nombre);
		fichas = new Text(centroX, centroY, String.valueOf(pais.cantidadDeFichas));
		misiles = new Text(centroX, centroY+10, String.valueOf(pais.misiles));
	}

	
	public void setColor(Jugador j) {
		for (String color : colores){
			if (ruta.contains(color)){
				ruta = ruta.replace(color, colores[j.numero]);
				break;
			}
		}
		try {
			imagen.setImage(new Image(new FileInputStream(ruta)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

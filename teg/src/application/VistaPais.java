package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class VistaPais {
	
	static String[] colores = { "AMARILLO", "AZUL", "CELESTE", "NARANJA", "ROJO", "VERDE"};

	Pais pais;
	
	ImageView imagen;
	
	Text nombre;
	
	Text fichas;
	
	Text misiles;
	
	private String ruta;

	Image image;

	int posX;

	int posY;
	
	public VistaPais(int centroX, int centroY, Pais pais, String ruta, int posX, int posY) {
		this.pais = pais;
		this.posX = posX;
		this.posY = posY;
		this.ruta = ruta;
		image = new Image(getClass().getResourceAsStream(ruta));
		imagen = new ImageView(image);
		imagen.setX(Main.offsetX+ posX*Main.escala);
		imagen.setY(Main.offsetY+ posY*Main.escala);
		imagen.setFitWidth(image.getWidth()*Main.escala);
		imagen.setFitHeight(image.getHeight()*Main.escala);
		
		
		
		nombre = new Text(centroX-50, centroY-50, pais.nombre);
		fichas = new Text(centroX, centroY, String.valueOf(pais.cantidadDeFichas));
		misiles = new Text(centroX, centroY+10, String.valueOf(pais.misiles));
	}

	
	public void setColor(Jugador j) {
//		for (String color : colores){
//			if (ruta.contains(color)){
//				ruta = ruta.replace(color, colores[j.numero]);
//				break;
//			}
//		}
//		imagen.setImage(new Image(getClass().getResourceAsStream(ruta)));
		
	}
}

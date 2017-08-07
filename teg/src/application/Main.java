package application;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	public static double offsetX = 200;
	public static double offsetY = 0;
	public static double escala = .5;
	
	private Teg teg = new Teg();
	boolean activo = false;
	 static int turno=0;
	@Override
	public void start(Stage primaryStage) {
		try {
			Image image = new Image(getClass().getResourceAsStream("/teg.jpg"));
			ImageView imageView = new ImageView(image);
			imageView.setOnScroll(new EventHandler<ScrollEvent>() {

				@Override
				public void handle(ScrollEvent event) {
					escala = event.getDeltaY() < 0 ? escala*.95 : escala/.95;
					imageView.setFitHeight(image.getHeight()*escala);
					imageView.setFitWidth(image.getWidth()*escala);
					
					for (VistaPais vistaPais : teg.paises) {
						vistaPais.imagen.setX(offsetX+ vistaPais.posX*escala);
						vistaPais.imagen.setY(offsetY+ vistaPais.posY*escala);
						vistaPais.imagen.setFitWidth(vistaPais.image.getWidth()*escala);
						vistaPais.imagen.setFitHeight(vistaPais.image.getHeight()*escala);
					}

				}
			});
			imageView.setX(offsetX);
			imageView.setY(offsetY);
			imageView.setFitHeight(image.getHeight()*escala);
			imageView.setFitWidth(image.getWidth()*escala);
			Button reagrupar = new Button("Reagrupar");
			Button can = new Button("Cartas");
			Label turn=new Label();
			
			turn.setLayoutX(100);
			EventHandler<MouseEvent> canjear = new EventHandler<MouseEvent>() {
					
				@Override
				public void handle(MouseEvent event) {
				
					
				}
			};
		
			
			EventHandler<MouseEvent> reagr = new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					
					if("Reagrupar".equals(reagrupar.getText())){
					activo = true;
					reagrupar.setText("Fin turno");
					}
					else if("Fin turno".equals(reagrupar.getText())){
						turno++;
						if(turno>=teg.cantidadDeJugadores) {
							turno=0;
						}
						turn.setText(String.valueOf(turno));
						
						reagrupar.setText("Reagrupar");
						activo=false;
						if(teg.gano()) {
						teg.entregar();
						}
					}

				}
				
			};

			reagrupar.setOnMouseClicked(reagr);
			Group group = new Group(imageView);
			ObservableList<Node> list = group.getChildren();
			Text evento = new Text(1000, 100, "");
			Text resultados = new Text(1000, 200, "");

			for (VistaPais vistaPais : teg.paises) {
				vistaPais.imagen.setEffect(new Glow(0));
				vistaPais.imagen.setOnDragDetected(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						ClipboardContent clipboardContent = new ClipboardContent();
						if (event.getButton().equals(MouseButton.PRIMARY)) {
							clipboardContent.putString("izquierdo");
						} else {
							clipboardContent.putString("derecho");
						}
						vistaPais.imagen.startDragAndDrop(TransferMode.ANY).setContent(clipboardContent);

						teg.pais1 = vistaPais;

						event.consume();
					}

				});
				vistaPais.imagen.setOnMouseEntered(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						((Glow)vistaPais.imagen.getEffect()).setLevel(.5);

						try {
							Media sound = new Media(new File(getClass().getResource("/Mousclik.wav").toURI()).toURI().toString());
							MediaPlayer mediaPlayer = new MediaPlayer(sound);
							mediaPlayer.play();
						} catch (URISyntaxException e) {
							e.printStackTrace();
						}
					}
				});
				vistaPais.imagen.setOnDragOver(new EventHandler<DragEvent>() {
					@Override
					public void handle(DragEvent event) {
						((Glow)vistaPais.imagen.getEffect()).setLevel(.5);
						event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
						event.consume();
					}
				});
				vistaPais.imagen.setOnDragExited(new EventHandler<DragEvent>() {
					@Override
					public void handle(DragEvent event) {
						((Glow)vistaPais.imagen.getEffect()).setLevel(0);
					}
				});
				vistaPais.imagen.setOnMouseExited(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						((Glow)vistaPais.imagen.getEffect()).setLevel(0);
					}
				});
				vistaPais.imagen.setOnDragDropped(new EventHandler<DragEvent>() {
					@Override
					public void handle(DragEvent event) {
						teg.pais2 = vistaPais;

						if (activo) {

							if (teg.pais1.pais.limita(teg.pais2.pais)
									&& (teg.pais1.pais.j.numero == teg.pais2.pais.j.numero)) {
								teg.pais1.pais.tranferir(teg.pais2.pais, 1);
								teg.pais1.fichas.setText(String.valueOf(teg.pais1.pais.getCantFichas()));
								teg.pais2.fichas.setText(String.valueOf(teg.pais2.pais.getCantFichas()));

							}
							return;
						}
						Dragboard db = event.getDragboard();
						try {
							if (db.getString().equals("derecho")) {
								int danio = teg.tirarMisil();
								for (int i = 0; i < teg.paises.size(); i++) {
									teg.paises.get(i).misiles.setText(teg.paises.get(i).pais.misiles + "");
									teg.paises.get(i).fichas.setText(teg.paises.get(i).pais.getCantFichas() + "");
									resultados.setText("daño " + danio);
									evento.setText(
											teg.pais1.pais.nombre + " lanzo un misil a " + teg.pais2.pais.nombre);
								}
							} else {
								List<int[]> list = teg.jugar();
								for (int i = 0; i < teg.paises.size(); i++) {
									teg.paises.get(i).fichas.setText(teg.paises.get(i).pais.getCantFichas() + "");
								}
								StringBuilder builder = new StringBuilder();
								for (int i = 0; i < list.get(0).length; i++) {
									builder.append(list.get(0)[i]).append(" ");
								}
								builder.append("\n\n");
								for (int i = 0; i < list.get(1).length; i++) {
									builder.append(list.get(1)[i]).append(" ");
								}
								resultados.setText(builder.toString());
								evento.setText(teg.pais1.pais.nombre + " ataco a " + teg.pais2.pais.nombre);

							}

						} catch (Exception e) {
							evento.setText(e.getMessage());
							resultados.setText("");
						}
						event.consume();
					}
				});
				vistaPais.imagen.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent mouseEvent) {
						vistaPais.imagen.setX(vistaPais.imagen.getX() + 1);
						System.out.println(vistaPais.pais.nombre);

					}
				});

				list.add(vistaPais.imagen);
				list.add(vistaPais.nombre);
				list.add(vistaPais.fichas);
				list.add(vistaPais.misiles);

			}
			list.add(evento);
			list.add(resultados);
			list.add(reagrupar);
			list.add(turn);
			list.add(can);
			Scene scene = new Scene(group, 1000, 600);
			primaryStage.setX(0);
			primaryStage.setY(0);
			primaryStage.setTitle("TEG");
			primaryStage.setScene(scene);
			primaryStage.setMaximized(true);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

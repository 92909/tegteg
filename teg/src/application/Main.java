package application;

import java.io.FileInputStream;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	private Teg teg = new Teg();

	@Override
	public void start(Stage primaryStage) {
		try {
			Image image = new Image(new FileInputStream("teg.jpg"));
//			Image image = new Image(getClass().getResourceAsStream("/teg.jpg"));
			ImageView imageView = new ImageView(image);
			imageView.setX(200);
			imageView.setY(0);
			imageView.setFitHeight(600);
			imageView.setFitWidth(600);
			imageView.setPreserveRatio(false);
			Image image2 = new Image(new FileInputStream("paca.png"));
//			Image image2 = new Image(getClass().getResourceAsStream("/paca.png"));
			ImageView imageView2 = new ImageView(image2);
			imageView2.setX(400);
			imageView2.setY(200);
			imageView2.setFitHeight(200);
			imageView2.setFitWidth(200);
			imageView2.setPreserveRatio(false);
			
			WritableImage wImage = new WritableImage((int)image2.getWidth(), (int)image2.getHeight()); 
			PixelReader pixelReader = image2.getPixelReader();

			PixelWriter writer = wImage.getPixelWriter();
			for (int y = 0; y < (int)image2.getHeight(); y++) {
				for (int x = 0; x < (int)image2.getWidth(); x++) {
					Color color = pixelReader.getColor(x, y);
					writer.setColor(x, y, !color.isOpaque() || color.equals(Color.BLACK) ? color : Color.AQUA  );


				}
			}
			ImageView imageView3 = new ImageView(wImage);
			imageView3.setX(500);
			imageView3.setY(200);
			imageView3.setFitHeight(200);
			imageView3.setFitWidth(200);
			imageView3.setPreserveRatio(false);

			Group group = new Group(imageView);
			ObservableList<Node> list = group.getChildren();
			BorderPane borderPane = new BorderPane(imageView3);
			list.add(borderPane);
			list.add(imageView2);
			Text evento = new Text(800, 100, "");
			Text resultados = new Text(800, 200, "");

			for (VistaPais vistaPais : teg.paises) {

				vistaPais.circle.setOnDragDetected(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						ClipboardContent clipboardContent = new ClipboardContent();
						if (event.getButton().equals(MouseButton.PRIMARY)) {
							clipboardContent.putString("izquierdo");
						} else {
							clipboardContent.putString("derecho");
						}
						vistaPais.circle.startDragAndDrop(TransferMode.ANY).setContent(clipboardContent);

						teg.pais1 = vistaPais.pais;

						event.consume();
					}

				});
				vistaPais.circle.setOnDragOver(new EventHandler<DragEvent>() {
					@Override
					public void handle(DragEvent event) {
						event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
						event.consume();
					}
				});
				vistaPais.circle.setOnDragDropped(new EventHandler<DragEvent>() {
					@Override
					public void handle(DragEvent event) {
						teg.pais2 = vistaPais.pais;
						Dragboard db = event.getDragboard();
						try {
							if (db.getString().equals("derecho")) {
								int danio = teg.tirarMisil();
								for (int i = 0; i < teg.paises.size(); i++) {
									teg.paises.get(i).misiles.setText(teg.paises.get(i).pais.misiles + "");
									teg.paises.get(i).fichas.setText(teg.paises.get(i).pais.getCantFichas() + "");
									resultados.setText("daño " + danio);
									evento.setText(teg.pais1.nombre + " lanzo un misil a " + teg.pais2.nombre);
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
								evento.setText(teg.pais1.nombre + " ataco a " + teg.pais2.nombre);
							}
						} catch (Exception e) {
							evento.setText(e.getMessage());
						}
						event.consume();
					}
				});
				vistaPais.circle.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent mouseEvent) {
						vistaPais.circle.setCenterX(vistaPais.circle.getCenterX() + 1);
						System.out.println(vistaPais.pais.nombre);

					}
				});

				list.add(vistaPais.circle);
				list.add(vistaPais.nombre);
				list.add(vistaPais.fichas);
				list.add(vistaPais.misiles);
			}
			list.add(evento);
			list.add(resultados);

			Scene scene = new Scene(group, 1000, 600);
			primaryStage.setX(0);
			primaryStage.setY(0);
			primaryStage.setTitle("TEG");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

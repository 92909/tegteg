package application;

import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	private Teg teg = new Teg();

	@Override
	public void start(Stage primaryStage) {
		try {
			Group group = new Group();
			ObservableList<Node> list = group.getChildren();
			Text evento = new Text(300, 100, "");
			Text resultados = new Text(300, 200, "");

			for (VistaPais vistaPais : teg.paises) {

				vistaPais.circle.setOnDragDetected(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						ClipboardContent clipboardContent = new ClipboardContent();
						clipboardContent.putString(vistaPais.pais.nombre);
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
						try {
							List<int[]> list = teg.jugar();
							for (int i = 0; i < teg.paises.size(); i++) {
								teg.paises.get(i).fichas.setText(teg.paises.get(i).pais.getCantFichas() + "");
							}
							StringBuilder builder = new StringBuilder();
							for(int i=0; i< list.get(0).length; i++){
								builder.append(list.get(0)[i]).append(" ");
							}
							builder.append("\n\n");
							for(int i=0; i< list.get(1).length; i++){
								builder.append(list.get(1)[i]).append(" ");
							}
							resultados.setText(builder.toString());
						} catch (Exception e) {
							e.printStackTrace();
						}
						evento.setText(teg.pais1.nombre + " ataco a " + teg.pais2.nombre);
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
			}
			list.add(evento);
			list.add(resultados);

			Scene scene = new Scene(group, 600, 300);
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

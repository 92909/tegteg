package application;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Teg teg = new Teg();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// Creating a Group
			Group group = new Group();
			ObservableList<Node> list = group.getChildren();
			
			for (int i=0; i<teg.paises.size(); i++){
				circle.setOnDragDetected(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						ClipboardContent clipboardContent = new ClipboardContent();
						clipboardContent.putString(text.getText());
						circle.startDragAndDrop(TransferMode.ANY).setContent(clipboardContent);
						
						teg.setPais1(teg.getPaises().get(circles.indexOf(circle)));
						
						event.consume();
					}
					
				});
				circle.setOnDragOver(new EventHandler<DragEvent>() {
				    @Override 
				    public void handle(DragEvent event) {
				        Dragboard db = event.getDragboard();
				        if (db.hasString()) {
				            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
				        }
				        event.consume();
				    }
				});
				circle.setOnDragDropped(new EventHandler<DragEvent>() {
				    @Override public void handle(DragEvent event) {
				        Dragboard db = event.getDragboard();
				        boolean success = false;
				        if (db.hasString()) {
				        	teg.setPais2(teg.getPaises().get(circles.indexOf(circle)));
				        	try {
								List<int[]> list = teg.jugar();
								for (int i=0; i<teg.getPaises().size(); i++){
									fichas.get(i).setText(teg.getPaises().get(i).getCantFichas()+"");
								}
//								for (int i=0; i<list.get(1).length; i++){
//									dados.get(i).setText(String.valueOf(list.get(1)[i]));
//								}
//								for (int i=0; i<list.get(2).length; i++){
//									dados.get(i+list.get(1).length).setText(String.valueOf(list.get(2)[i]));
//								}
							} catch (Exception e) {
								e.printStackTrace();
							}
				        	evento.setText(texts.get(teg.getPaises().indexOf(teg.getPais1())).getText() + " ataco a " + texts.get(teg.getPaises().indexOf(teg.getPais2())).getText());
				            success = true;
				        }
				        event.setDropCompleted(success);
				        event.consume();
				    }
				});
				circle.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent mouseEvent) {
						circle.setCenterX(circle.getCenterX()+1);
						
					}
				});
			}
			
			
			// Creating a Scene by passing the group object, height and width
			Scene scene = new Scene(group, 600, 300);

			// Setting the title to Stage.
			primaryStage.setTitle("TEG");

			// Adding the scene to Stage
			primaryStage.setScene(scene);

			// Displaying the contents of the stage
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
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
			
			Circle[] circles = new Circle[4];
			Text[] texts = new Text[4];
			Color[] colors = {Color.RED, Color.GREENYELLOW, Color.BLUE, Color.LIGHTBLUE};
			String[] nombres = {"Paraguay", "Brasil", "Argentina", "Uruguay"};
			
			for (int i=0; i<4; i++){
				circles[i] = new Circle(100+100*(i%2), 100+100*(i/2), 50, colors[i]);
				texts[i] = new Text(50+100*(i%2), 50+100*(i/2), nombres[i]);
				final Circle circle = circles[i];
				final Text text= texts[i];
				circle.setOnDragDetected(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						ClipboardContent clipboardContent = new ClipboardContent();
						clipboardContent.putString(text.getText());
						circle.startDragAndDrop(TransferMode.ANY).setContent(clipboardContent);
						
						circle.setEffect(new Glow(.9));
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
				            text.setText(db.getString());
				            success = true;
				        }
				        teg.mostrarPais(text.getText());
				        event.setDropCompleted(success);
				        event.consume();
				    }
				});
			}
			
			list.addAll(circles);
			list.addAll(texts);
			
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

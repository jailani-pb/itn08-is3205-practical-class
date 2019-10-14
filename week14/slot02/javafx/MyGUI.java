package week14.slot02.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyGUI extends Application {

	public static Stage currentStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("MyGUI.fxml")
				);
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		currentStage = primaryStage;
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

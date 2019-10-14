package week14.slot02.javafx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MyGUIController {
	
	@FXML
	Label labelNumber, labelWarning;
	
	public void numberClicked(ActionEvent e) {
		Button clickedButton = (Button) e.getSource();
		if(labelNumber.getText().length() < 6) {
			String currentLabel = labelNumber.getText();
			labelNumber.setText(currentLabel + clickedButton.getText());
		}
	}
	
	public void submit() throws IOException {
		if(labelNumber.getText().equals("123456")) {
//			labelWarning.setText("Correct Pin");
//			labelWarning.setStyle("-fx-background-color: green");
			FXMLLoader fxmlLoader = new FXMLLoader(
					getClass().getResource("MainPage.fxml")
					);
			Parent root = fxmlLoader.load();
			Scene scene = new Scene(root, 400, 400);
			MyGUI.currentStage.setScene(scene);
		} else {
			labelWarning.setText("Invalid Pin");
			labelWarning.setStyle("-fx-background-color: red");
		}
	}
	
	public void clear() {
		labelNumber.setText("");
	}
	
}

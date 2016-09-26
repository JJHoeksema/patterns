package main;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

public class TextView {
	
	public TextView(FlowPane rootLayout) {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(TextView.class.getResource("/view/TextView.fxml"));
            AnchorPane textLayout = (AnchorPane) loader.load();
            rootLayout.getChildren().add(textLayout);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}

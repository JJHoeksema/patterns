package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.GrabStocks;
import main.TextView;

public class MenuController {
	@FXML
	private MenuBar menuBar;
	
	@FXML
	private void switchTextView() {
		   try {
			   	FlowPane rootLayout = (FlowPane) menuBar.getScene().getRoot();
			   	
			   	FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(TextView.class.getResource("/view/TextView.fxml"));
	            HBox textLayout = (HBox) loader.load();
	            GrabStocks.controller = loader.getController();;
	            
	            rootLayout.getChildren().clear();
	            rootLayout.getChildren().add(textLayout);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	@FXML 
	private void switchChartView() {
		try {
			FlowPane rootLayout = (FlowPane) menuBar.getScene().getRoot();
			
			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(TextView.class.getResource("/view/ChartView.fxml"));
            Pane chartLayout = (Pane) loader.load();
            GrabStocks.controller = loader.getController();;
            
            rootLayout.getChildren().clear();
            rootLayout.getChildren().add(chartLayout);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}

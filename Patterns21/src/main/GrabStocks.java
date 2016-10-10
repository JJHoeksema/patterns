package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Stock;
import controller.TextViewController;

public class GrabStocks extends Application {
	
	private Stage primaryStage;
	
	private FlowPane rootLayout;
	
	public static Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Stocks");
		
		initRootLayout();
	}
	
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(GrabStocks.class.getResource("/view/BaseLayout.fxml"));
			rootLayout = (FlowPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			// setup chart view
			try {
	            loader = new FXMLLoader();
	            loader.setLocation(GrabStocks.class.getResource("/view/ChartView.fxml"));
	            Pane chartLayout = (Pane) loader.load();
	            controller = loader.getController();;
	            rootLayout.getChildren().add(chartLayout);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
			controller = loader.getController();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		// Create the Subject object
		// It will handle updating all observers
		// as well as deleting and adding them
		StockGrabber stockGrabber = new StockGrabber();
		
		// Create an Observer that will be sent updates from Subject
		stockGrabber.register(new StockObserver("IBM", stockGrabber));
		stockGrabber.register(new StockObserver("AAPL", stockGrabber));
		stockGrabber.register(new StockObserver("GOOG", stockGrabber));
		
		// start the threads to get the stock prices
		new Thread(new GetTheStock("IBM", 95., stockGrabber)).start();
		new Thread(new GetTheStock("AAPL", 105., stockGrabber)).start();
		new Thread(new GetTheStock("GOOG", 104., stockGrabber)).start();
	
		launch(args);
	}
	
}
package controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import main.Controller;
import model.Stock;

public class TextViewController implements Controller {
	private static final int MAX_HISTORY = 25;
	
	@FXML
	private TableView<Stock> ibmTable;
	@FXML
	private TableView<Stock> aaplTable;
	@FXML
	private TableView<Stock> googTable;
	
	@FXML
	private TableColumn<Stock, Number> ibmColumn;
	@FXML
	private TableColumn<Stock, Number> aaplColumn;
	@FXML
	private TableColumn<Stock, Number> googColumn;
	
	@FXML
	private ObservableList<Stock> ibmData = FXCollections.observableArrayList();
	@FXML
	private ObservableList<Stock> aaplData = FXCollections.observableArrayList();	
	@FXML
	private ObservableList<Stock> googData = FXCollections.observableArrayList();
	
	public TextViewController() {
		
	}
	
	@FXML
	private void initialize() {
		ibmTable.setItems(ibmData);
		ibmColumn.setCellValueFactory(cellData -> cellData.getValue().priceProperty());
		googTable.setItems(googData);
		googColumn.setCellValueFactory(cellData -> cellData.getValue().priceProperty());
		aaplTable.setItems(aaplData);
		aaplColumn.setCellValueFactory(cellData -> cellData.getValue().priceProperty());
	}
	
	@Override
	public void update(String name, double price) {
		// schedule for the JavaFX thread
		Platform.runLater(new Runnable() {
		    @Override 
		    public void run() {
				ObservableList<Stock> data;
				if (name.equals("IBM"))
					data = ibmData;
				else if(name.equals("GOOG"))
					data = googData;
				else 
					data = aaplData;
				
				data.add(new Stock(name, price));
				if (data.size() > MAX_HISTORY)
					data.remove(0);
		    }
		});	

	}
}

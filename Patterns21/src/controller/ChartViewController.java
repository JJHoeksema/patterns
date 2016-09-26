package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import main.Controller;

public class ChartViewController implements Controller {
	
	@FXML
	LineChart<Number, Number> lineChart;
	
	static XYChart.Series<Number, Number> ibmSeries;
	static XYChart.Series<Number, Number> aaplSeries;
	static XYChart.Series<Number, Number> googSeries;
	
	@SuppressWarnings("unchecked")
	@FXML
	private void initialize() {
		ibmSeries = new XYChart.Series<Number, Number>();
		aaplSeries = new XYChart.Series<Number, Number>();
		googSeries = new XYChart.Series<Number, Number>();
		ibmSeries.setName("IBM");
		aaplSeries.setName("AAPL");
		googSeries.setName("GOOG");
		lineChart.getData().addAll(ibmSeries, aaplSeries, googSeries);
	}

	@Override
	public void update(String name, double price) {
		//lineChart.getData().clear();
		// schedule for the JavaFX thread
		Platform.runLater(new Runnable() {
		    @Override 
		    public void run() {
				XYChart.Series<Number, Number> series;
				if (name.equals("IBM"))
					series = ibmSeries;
				else if(name.equals("GOOG"))
					series = googSeries;
				else 
					series = aaplSeries;

				series.getData().add(new XYChart.Data<Number, Number>(series.getData().size(), price));
		    }
		});	
	}
}

package main;

import java.util.ArrayList;
import java.util.Vector;

import javafx.collections.ObservableList;
import model.Stock;

public class StockObserver implements Observer {
	private double price;
	// Static used as a counter
	private static int observerIDTracker = 0;
	// Used to track the observers
	private int observerID;
	
	private String stock;
	
	public StockObserver(String stock, Subject stockGrabber) {
		this.stock = stock;
		// Assign an observer ID and increment the static counter
		this.observerID = ++observerIDTracker;
		// Message notifies user of new observer
		System.out.println("New Observer " + this.observerID);
		// Add the observer to the Subjects ArrayList
		stockGrabber.register(this);
	}

	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		if (stock.equals("IBM"))
			this.price = ibmPrice;
		else if (stock.equals("AAPL"))
			this.price = aaplPrice;
		else if (stock.equals("GOOG"))
			this.price = googPrice;
		if (GrabStocks.controller != null)
			GrabStocks.controller.update(stock, price);
		//printThePrices();
	}

	public void printThePrices(){
		System.out.println(observerID + "\n" + stock + ": " + price + "\n");
	}
}

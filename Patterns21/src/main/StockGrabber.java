package main;

import java.util.ArrayList;

//Uses the Subject interface to update all Observers
public class StockGrabber implements Subject {
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber(){
		// Creates an ArrayList to hold all observers
		observers = new ArrayList<Observer>();
	}

	public void register(Observer newObserver) {
		// Adds a new observer to the ArrayList
		observers.add(newObserver);
	}

	public void unregister(Observer deleteObserver) {
		observers.remove(deleteObserver);
	}

	public void notifyObservers() {
		// Cycle through all observers and notifies them of price changes
		for(Observer observer : observers){
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	// Change prices for all stocks and notify observers of changes
	public void setIBMPrice(double newIBMPrice){
		this.ibmPrice = newIBMPrice;
		notifyObservers();
	}

	public void setAAPLPrice(double newAAPLPrice){
		this.aaplPrice = newAAPLPrice;
		notifyObservers();
	}

	public void setGOOGPrice(double newGOOGPrice){
		this.googPrice = newGOOGPrice;
		notifyObservers();
	}
}
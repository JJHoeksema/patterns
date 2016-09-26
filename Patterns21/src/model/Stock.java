package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Stock {
	private StringProperty name;
	private DoubleProperty price;
	
	public Stock() {
		this(null, 0.);
	}
	
	public Stock(String name, double price) {
		this.name = new SimpleStringProperty(name);
		this.price = new SimpleDoubleProperty(price);
	}
	
	public String getName() {
		return name.get();
	}
	
	public void setName(String name) {
		this.name.set(name);;
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public double getPrice() {
		return price.get();
	}
	
	public void setPrice(double price) {
		this.price.set(price);
	}
	
	public DoubleProperty priceProperty() {
		return price;
	}
	
}

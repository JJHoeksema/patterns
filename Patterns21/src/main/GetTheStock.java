package main;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
	
	private String stock;
	private double price;
	private Subject subject;
	private boolean isRunning;
	
	public GetTheStock(String stock, double price, Subject subject) {
		this.stock = stock;
		this.price = price;
		this.subject = subject;
	}
	
	public void run() {
		isRunning = true;
		while (isRunning) {
			// calculate new price
			double randNum = (Math.random() * 4) - 2;
			price = (price + randNum);
			
			if (stock.equals("IBM"))
				((StockGrabber)subject).setIBMPrice(price);
			else if (stock.equals("AAPL"))
				((StockGrabber)subject).setAAPLPrice(price);
			else if (stock.equals("GOOG"))
				((StockGrabber)subject).setGOOGPrice(price);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

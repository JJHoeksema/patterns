public class IbmObserver implements Observer {
	private double ibmPrice;
	// Static used as a counter
	private static int observerIDTracker = 0;
	// Used to track the observers
	private int observerID;
	private Subject stockGrabber;

	public IbmObserver(Subject stockGrabber){
		// Store reference to the stockGrabber object so
		// I can make calls to its methods
		this.stockGrabber = stockGrabber;
		// Assign an observer ID and increment the static counter
		this.observerID = ++observerIDTracker;
		// Message notifies user of new observer
		System.out.println("New Observer " + this.observerID);
		// Add the observer to the Subjects ArrayList
		stockGrabber.register(this);
	}

	// Called to update all observers
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		printThePrices();
	}

	public void printThePrices(){
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\n");
	}
}

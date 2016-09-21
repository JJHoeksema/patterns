
public abstract class ToppingDecorator implements Pizza {
	protected Pizza tempPizza;
	protected String size;
	
	public ToppingDecorator(Pizza newPizza){
		tempPizza = newPizza;
	}
	
	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		return tempPizza.getCost();
	}

	public String getSize(){
		return size;
	}
	public void setSize(String sizen){
		size=sizen;
		return;
	}

}

public class TomatoSauce extends ToppingDecorator {
	public TomatoSauce(Pizza newPizza){
		super(newPizza);

		System.out.println("adding sauce");
		
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Tomato sauce";
			
	}
	
	public double getCost() {
		return tempPizza.getCost() +  .60; 
	}

}
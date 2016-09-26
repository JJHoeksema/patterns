
public abstract class localpopulator implements Supermarkt {
	protected Supermarkt tempSupermarkt;

	
	public localpopulator(Supermarkt newSupermarkt){
		tempSupermarkt = newSupermarkt;
	}
	
	@Override
	public String getDescription() {
		return tempSupermarkt.getDescription();
	}

	@Override
	public double getRevenue() {
		return tempSupermarkt.getRevenue();
	}



}

public class Overwinningsplein extends localpopulator {
	public Overwinningsplein(Supermarkt newSupermarkt){
		super(newSupermarkt);
		
	}

	public String getDescription() {
		return tempSupermarkt.getDescription() + ", Overwinningsplein";
	}
	
	public double getRevenue() {
		return tempSupermarkt.getRevenue() +  .60;
	}

}
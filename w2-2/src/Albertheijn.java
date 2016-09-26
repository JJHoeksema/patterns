
public class Albertheijn extends localpopulator {
	public Albertheijn(Supermarkt newSupermarkt){
		super(newSupermarkt);
		
	}

	public String getDescription() {
		return tempSupermarkt.getDescription() + ", Albertheijn";
			
	}
	
	public double getRevenue() {
		return tempSupermarkt.getRevenue() + .50;
	}
}

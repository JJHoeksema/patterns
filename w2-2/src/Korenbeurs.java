public class Korenbeurs extends localpopulator {
	public Korenbeurs(Supermarkt newSupermarkt){
		super(newSupermarkt);
		
	}

	public String getDescription() {
		return tempSupermarkt.getDescription() + ", Korenbeurs";
			
	}
	
	public double getRevenue() {
		return tempSupermarkt.getRevenue() +  .60;
	}

}
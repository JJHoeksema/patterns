
public class SuperMaker {
	public static void main(String[] args){
		Supermarkt basicSupermarkt = new Korenbeurs( new Albertheijn(new PlainSupermarkt()));

		System.out.println("Description: " + basicSupermarkt.getDescription());
		System.out.println("Revenue: " + basicSupermarkt.getRevenue());

	}
}

/**
 * Created by user on 27-9-2016.
 */
public class Fac {
    public void doit() {
        System.out.println("Start");
        Supermarkt object = factory();
        System.out.println("Description: " + object.getDescription());
        System.out.println("Revenue: " + object.getRevenue());
        System.out.println("End");
    }
    private Supermarkt factory(){
        Supermarkt basicSupermarkt = new Korenbeurs( new Albertheijn(new PlainSupermarkt()));
        System.out.println("Make supermarkt");

        return basicSupermarkt;
    }
}

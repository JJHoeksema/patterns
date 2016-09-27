/**
 * Created by user on 27-9-2016.
 */
public class Fac {
    public void doit() {
        System.out.println("Start");
        Supermarkt object = factory("koren");
        System.out.println("Description: " + object.getDescription());
        System.out.println("Revenue: " + object.getRevenue());
        System.out.println("End");
    }
    private Supermarkt factory(String arg){
        switch(arg) {
            case "koren":
                System.out.println("Make supermarkt");
                return new Korenbeurs(new Albertheijn(new PlainSupermarkt()));
            case "over":
                System.out.println("Make supermarkt");
                return new Overwinningsplein(new Albertheijn(new PlainSupermarkt()));
        }


        return null;
    }
}

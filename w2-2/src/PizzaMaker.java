
public class PizzaMaker {
	public static void main(String[] args){
		Pizza basicPizza = new TomatoSauce( new Mozzarella(new PlainPizza()));
		basicPizza.setSize("L");
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
		System.out.println("Size: " + basicPizza.getSize());
	}
}

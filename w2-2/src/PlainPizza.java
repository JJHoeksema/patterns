
public class PlainPizza implements Pizza {
	public String size;
	@Override
	public String getDescription() {
		//TODO auto-generated method stub
		return "Dough";
	}

	@Override
	public double getCost() {
		// TODO auto-generated method stub
		return 4.00;
	}
	public String getSize(){
		return size;
	}
	public void setSize(String sizen){
		size=sizen;
		return;
	}
}

/*
 * Name : Omer Malka
 * Id : 318766730 
 */


package H_W_3;




public class Decorator implements Component {
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public double getTotal() {
		return component.getTotal();
	}

	@Override
	public String getPizzaName() {
		return component.getPizzaName();
	}

	
}

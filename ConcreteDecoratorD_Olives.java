/*
 * Name : Omer Malka
 * Id : 318766730 
 */

package H_W_3;

public class ConcreteDecoratorD_Olives extends Decorator {

	public ConcreteDecoratorD_Olives(Component component) {
		super(component);
	}

	@Override
	public String getPizzaName() {
		String[] words = super.getPizzaName().split(" ");
		boolean check = true;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("with")) {
				check = false;
			}
		}
		if (check) {
			return super.getPizzaName() + " with olives";
		}
		return super.getPizzaName() + " and olives";
	}

	public double getTotal() {
		return (super.getTotal() + ADDITION_PAY);
	}

}

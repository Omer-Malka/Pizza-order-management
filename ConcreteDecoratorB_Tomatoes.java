/*
 * Name : Omer Malka
 * Id : 318766730 
 */

package H_W_3;

public class ConcreteDecoratorB_Tomatoes extends Decorator {

	public ConcreteDecoratorB_Tomatoes(Component component) {
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
			return super.getPizzaName() + " with tomatos";
		}
		return super.getPizzaName() + " and tomatos";
	}

	public double getTotal() {
		return (super.getTotal() + ADDITION_PAY);
	}
}

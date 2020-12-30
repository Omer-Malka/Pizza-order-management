/*
 * Name : Omer Malka
 * Id : 318766730 
 */

package H_W_3;



public class ConcreteDecoratorA_Bulgarian_Cheese extends Decorator {
	
	public ConcreteDecoratorA_Bulgarian_Cheese(Component component) {
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
			return super.getPizzaName() + " with bulgarit";
		 }
		 return super.getPizzaName() + " and bulgarit";
	}
	
	
	public double getTotal() {
		return (super.getTotal()+ADDITION_PAY);
	}
	
	
	

	
	
	
}

/*
 * Name : Omer Malka
 * Id : 318766730 
 */

package H_W_3;

public class ConcretePizza implements Component {
	
	private String name;
	private int numOfCalories;
	private int price ;
	
	

	public ConcretePizza(String name, int numOfCalories, int price) {
		super();
		this.name = name;
		this.numOfCalories = numOfCalories;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}
	
	public int getNumOfCalories() {
		return numOfCalories;
	}


	public double getPrice() {
		return price;
	}
	@Override
	public double getTotal() {
		return price;
	}

	@Override
	public String getPizzaName() {
		return name;
	}

}

/*
 * Name : Omer Malka
 * Id : 318766730 
 */

package H_W_3;

import java.util.ArrayList;
import java.util.Scanner;



public class Program {

	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		boolean finished = false;
		char op ;
		while(finished==false) {
		System.out.println("Welcome to Omer Program : \n");
		System.out.println("1) Question1");
		System.out.println("2) Question2");
		System.out.println("\nChoose Your Option Or Press Any Key To EXIT");
		System.out.print("Your Option: ");
		op = s.next().charAt(0);
		switch (op) {
		case '1':
			question1();
			break;
		case '2':
			question2();
			break;
			
		default:
			finished=true;
			break;
		}
		}
		if(finished) {
			System.out.println("\nBye Bye !");
		}
		}
		
		public static void question1() {
			System.out.println("\nQuestion 1 : ");
			boolean isFinished = false;
			int numOfArticales = 0;
			String word;
			int sum =0 ;
			

			while (isFinished == false) {
				System.out.println("\nWelcome to Find word World (:\n");
				System.out.println("If you like to continue enter 'y'\n" + "If you like to EXIT press other key to EXIT\n");
				System.out.print("Your option :");
				if (!s.next().equalsIgnoreCase("y")) {
					isFinished = true;
					break;
				}
				System.out.println("\nFirst insert the number of articales that you want to search in");
				System.out.print("Number of articales :");
				numOfArticales = Integer.parseInt(s.next());
				//Lists of articals and Threads 
				ArrayList<Thread> threads = new ArrayList<Thread>();
				ArrayList<String> articales = new ArrayList<String>();
				System.out.println("\nSecond ,");
				for (int i = 0; i < numOfArticales; i++) {
					System.out.println("\nEnter the name of artical " + (i + 1));
					System.out.print("Artical name : ");
					articales.add(s.next());
				}
				System.out.println("\nAnd Now Enter the word you want to findin the articales");
				System.out.print("The word : ");
				word = s.next();
				for (int i = 0; i < numOfArticales; i++) {
					CountNumOfStr counter = new CountNumOfStr(articales.get(i), word);
					threads.add(new Thread(counter, "thread" + i));
					// Play the Run function 
					threads.get(i).run();
					//Sum the number of times the word appear
					sum += counter.getCount();
				}
				
				System.out.println("\nTotal number of times the word "+"'"+word+"'"+" appears in all the articles is "+sum + "\n");

			}

			System.out.println("\nThank you , we hope we help you , Bye Bye \n");
			
			
			
			
		}
	
		public static void question2() {
		
			System.out.println("Question 2 : \n");
			
		 //make pizzas
		 ConcretePizza p1 = new Private_Pizza();  
		 ConcretePizza p2 = new Family_Pizza();
		 ConcretePizza p3 = new Huge_Pizza();
		
		//Pizzas before Topics
		System.out.println("\n"+p1.getName()+" : "+p1.getTotal());
		System.out.println(p2.getName()+" : "+p2.getTotal());
		System.out.println(p3.getName()+" : "+p3.getTotal());
		
		Component c1 = new ConcreteDecoratorC_Mushrooms(new ConcreteDecoratorA_Bulgarian_Cheese(new Private_Pizza()));//make the decorated pizza
		Component c2 = new ConcreteDecoratorD_Olives(new ConcreteDecoratorB_Tomatoes(new Family_Pizza()));
		Component c3 = new ConcreteDecoratorA_Bulgarian_Cheese(new ConcreteDecoratorC_Mushrooms(new Huge_Pizza()));
		
		//Pizzas after Topics
		System.out.println("\n"+c1.getPizzaName()+" : "+c1.getTotal());
		System.out.println(c2.getPizzaName()+" : "+c2.getTotal());
		System.out.println(c3.getPizzaName()+" : "+c3.getTotal()+"\n");
		
		}

	
}


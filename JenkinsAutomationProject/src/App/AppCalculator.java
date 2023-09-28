package App;

import Classes.Calculator;

public class AppCalculator {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println(c.add(3,4));
	
		System.out.println(c.div(5.6 , 2.3));
	
		System.out.println(c.subtract(3.2 , 4));
	
		System.out.println(c.mult(4 ,6));
		
	}

}

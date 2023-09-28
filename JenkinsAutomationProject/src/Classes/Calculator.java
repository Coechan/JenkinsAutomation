package Classes;

import java.util.Scanner;

public class Calculator {
//	private double num1;
//	private double num2;
//	
//	Scanner sc = new Scanner(System.in).useDelimiter("\n");
//	
	
	public Calculator() {
		
	}
	
//	public Calculator(double num1, double num2, Scanner sc) {
//		this.num1 = num1;
//		this.num2 = num2;
//	}
//
//	
//	public double getNum1() {
//		return num1;
//	}
//
//
//	private void setNum1(double num1) {
//		this.num1 = num1;
//	}
//
//
//	public double getNum2() {
//		return num2;
//	}
//
//
//	private void setNum2(double num2) {
//		this.num2 = num2;
//	}
//
//
//	public void assignNum() {
//		System.out.println("add the first num");
//		this.setNum1(sc.nextDouble());
//		System.out.println("add the second num");
//		this.setNum2(sc.nextDouble());
//		
//	}


	public double add(double num1 , double num2) {
		return num1 + num2;
	}
	
	public Double div(double num1 , double num2) {
		try {
			return num1/num2;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
	
	public double subtract(double num1 , double num2) {
		return num1 - num2;
	}

	public double mult(double num1 , double num2) {
		return num1 * num2;
	}
}


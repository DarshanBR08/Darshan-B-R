package Assignment;

import java.util.Scanner;

public class Calculator {
	public static void calculate(double a,double b,String operation) {
		if(operation.equalsIgnoreCase("addition") || operation.equalsIgnoreCase("add")) {
			System.out.println(a+b);
		}
		else if(operation.equalsIgnoreCase("subtraction") || operation.equalsIgnoreCase("subtract")) {
			System.out.println(a-b);
		}
		else if(operation.equalsIgnoreCase("multiplication") || operation.equalsIgnoreCase("multiply")) {
			System.out.println(a*b);
		}
		else if(operation.equalsIgnoreCase("division") || operation.equalsIgnoreCase("divide")){
			System.out.println(a/b);
		}
		else {
			System.out.println("please enter valid operation");
		}
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	for(int i=0; ;i++) {
	System.out.println("Enter the value of a and b");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	System.out.println("Select the Operation to perform");
	System.out.println("1.Addition  ||  2.Subtraction  ||  3.Multiplication  ||  4.Division");
	String operation=sc.next();
	calculate(a,b,operation);
}
}
}

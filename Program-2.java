package Assignment;

import java.util.Scanner;

public class Program2 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int x=sc.nextInt();
	int count=0;
	int i=1;
	while(count<=x) {
		if(i%2 != 0) {
			if(count==x-1) {
				System.out.print(i);
				break;
			}
			else {
			System.out.print(i+",");
			count++;
			}
			
		}i++;
		
	}
}
}

package Assignment;

import java.util.Scanner;

public class Program3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int x=sc.nextInt();
	if(x%2==0) {
		x=x-1;
	}
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

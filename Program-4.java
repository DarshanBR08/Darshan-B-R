package Assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of values in array");
	int n=sc.nextInt();
	int[] input=new int[n];
	for(int i=0;i<n;i++) {
		input[i]=sc.nextInt();
	}


//			or
//	
//	int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};



    Map<Integer, Integer> result = new HashMap<>();
    for (int i = 1; i <= 9; i++) {
        result.put(i, 0);
    }
    for (int num : input) {
        for (int i = 1; i <= 9; i++) {
            if (num % i == 0) {
                result.put(i, result.get(i) + 1);
            }
        }
    }
    System.out.println(result);
}
}

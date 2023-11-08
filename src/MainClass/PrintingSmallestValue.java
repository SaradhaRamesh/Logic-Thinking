package MainClass;
//import java.util.*;
import java.util.Scanner;

import ProblemSolving.FindingValue;

public class PrintingSmallestValue {
	public static void main(String[] args) {
		int arr[]= {9,8,3,5,1,7,12};
		Scanner s=new Scanner(System.in);
		FindingValue obj= new FindingValue();
		//obj.minMax(arr);
		//int n=s.nextInt();
		//System.out.println("The index of "+n+" : "+obj.findValue(arr,n));
		System.out.println("The prime numbers are : "+obj.primenumber(arr));
		obj.primenumber(10);
		
}
}

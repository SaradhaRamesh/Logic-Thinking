package ProblemSolving;

import java.util.ArrayList;

public class FindingValue {
	public void minMax(int arr[]) {
		int min=arr[0];int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				min=arr[i];
				max=arr[i];
			}
		if(arr[i]<min) 
			min=arr[i];
		System.out.println("Min val:"+min);
				
		if(arr[i]>max) 
			max=arr[i];
			System.out.println("Max val:"+max);
		
		
	}
	}
public int findValue(int arr[],int n) {
	int index=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==n)
			index=i;
			}
	return index;
}

public ArrayList<Integer>primenumber(int arr[] ) {
	ArrayList<Integer> ar=new  ArrayList<Integer>(); 
	int count =0;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=2;j<arr[i];j++)
		{
			if(arr[i]%j == 0)
				count++;
		}
		if(count == 0 && arr[i] != 1)
			ar.add(arr[i]);
		count =0;
	}
	return ar;
		
}
public int primenumber(int a) {
	int count=0;
		for(int i=2;i<a;i++) {
		if(a%i==0) {
			System.out.print("Not a prime number");
			count++;
			break;
		}
	}
	if(count==0&&a!=1)
		System.out.print("prime number");
	return 0;
}

	}



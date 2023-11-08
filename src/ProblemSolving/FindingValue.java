package ProblemSolving;

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
public void arrayPrimenumber(int arr[]) {
	
	int n= arr.length;
	int count =0;
	
	for(int i=0;i<n;i++) {
		for(int j=2;j<=arr[i];j++)
		{
			if(arr[i]%j == 0)
				count++;
		}
		if(count == 1)
		System.out.print(arr[i]+" ");
		count =0;
	}
		
}

	}



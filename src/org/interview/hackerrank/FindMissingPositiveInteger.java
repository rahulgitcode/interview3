package org.interview.hackerrank;

public class FindMissingPositiveInteger {
	
	public static void main(String[] args){
		int arr[] = {2, 3, 7, 6, 8, -1, -10, 15};
		int size = arr.length;
		
		int missing = findMissing(arr, size);
		System.out.println(missing);
	}

	private static int findMissing(int[] arr, int size) {
		
		int val;
		int nextval;
		
		for(int i=0; i<size; i++){
			if(arr[i]<=0 || arr[i]>size)
				continue;
			
			val = arr[i];
			
			while(arr[val-1]!=val){
				nextval = arr[val-1];
				arr[val-1] = val;
				val = nextval;
				
				if(val<=0 || val>size)
					break;
			}
		}
		
		for(int i=0;i<size; i++){
			if(arr[i]!=i+1){
				return i+1;
			}
		}
		
		return size+1;
	}

}

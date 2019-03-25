package org.interview.hackerrank;

public class MiniMaxSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		miniMaxSum(arr);

	}

	private static void miniMaxSum(int[] arr) {
		long[] sumarr = new long[5];
        long minsum = 0;
        long maxsum = 0;
        

        for(int i=0;i<arr.length; i++){
        	long sum =0;
            for(int j=0; j<arr.length; j++){
                if(j!=i){
                    sum = sum + arr[j];
                }
            }
            sumarr[i] = sum;
        }

        minsum= maxsum = sumarr[0];

        for(long s : sumarr){
            if(s<minsum){
                minsum = s;
            }else if(s>maxsum){
                maxsum = s;
            }
        }
        System.out.println(minsum+" "+maxsum);
        

		
	}

}

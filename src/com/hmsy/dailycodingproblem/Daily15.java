package com.hmsy.dailycodingproblem;

import java.util.Random;

/**
 * 
 * Daily Coding Problem: Problem #15 [Medium]


 * This problem was asked by Facebook.

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.
 *
 *This is a RESERVOIR SAMPLING Problem (https://www.geeksforgeeks.org/reservoir-sampling/)
 *
 */
public class Daily15 {

	public static void main(String[] args) {
		int k=5;
		int[] stream = {1,2,3,4,5,6,7,8,9,11,12,22,11,33,453,656,77,888,999,1920};
		int[] reservoir = new int[k];
		int[] sampleK = reservoirSample(stream, k);
		
		System.out.println("Random K elements from input stream: ");
		for(int i : sampleK)
			System.out.print(i+" ");

	}

	private static int[] reservoirSample(int[] stream, int k) {
		int[] result = new int[k];
		
		int i;
		for(i=0;i<k; i++){
			result[i] = stream[i];
		}
		
		Random rand = new Random();
		for(;i<stream.length; i++){
			int j = rand.nextInt(i+1);
			if(j<k){
				result[j] = stream[i];
			}
		}
		return result;
	}

}

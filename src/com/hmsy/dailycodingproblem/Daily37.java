package com.hmsy.dailycodingproblem;
/**
 * 
 * Daily Coding Problem: Problem #37 [Easy]
 * 
 * This problem was asked by Google. 

The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.

You may also use a list or array to represent a set.
 *
 */
public class Daily37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] set = {'a','b','c','d'};
		printpowerset(set);

	}

	private static void printpowerset(char[] set) {
		// TODO Auto-generated method stub
		long powsetlen = (long)Math.pow(2, set.length);
		for(int i=0; i<powsetlen; i++){
			for(int j=0; j<set.length; j++){
				if((i & (1 << j)) > 0) 
                    System.out.print(set[j]);
			}
			System.out.println("");
		}
	}
}

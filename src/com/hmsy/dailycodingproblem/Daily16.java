package com.hmsy.dailycodingproblem;

import java.util.Stack;
/**
 * 
 * Daily Coding Problem: Problem #16 [Easy]

 * This problem was asked by Twitter.

You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
You should be as efficient with time and space as possible.
 * 
 * Implement a stack solution
 *
 */

public class Daily16 {
	
	static Stack<Integer> st;
	
	public static void main(String[] args) {
		st = new Stack<>();
		
		int[] orders = {12,34,22,11,4,98,777,8,43,56};
		
		for(int i=0; i<orders.length; i++){
			record(orders[i]);
		}
		
		System.out.println("Getting the last 2th order from current: "+ get_last(2));
	}

	private static int get_last(int i) {
		int res = 0;
		for(int j=0;j<i; j++){
			res = st.pop();
		}
		return res;
	}

	private static void record(int i) {
		st.add(i);
	}

}

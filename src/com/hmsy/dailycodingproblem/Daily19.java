package com.hmsy.dailycodingproblem;
/*
 * Daily Coding Problem: Problem #19 [Medium]
 * 
 * This problem was asked by Facebook.

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.


 */
public class Daily19 {

	public static void main(String[] args) {
		int[][] cost = new int[][] { 
			new int[] { 7, 3, 8, 6, 1, 2},
			new int[] { 5, 6, 7, 2, 4, 3},
			new int[] {10, 1, 4, 9, 7, 6}
		};
			
		System.out.println(cost.length);	

	}

}

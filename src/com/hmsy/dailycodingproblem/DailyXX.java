package com.hmsy.dailycodingproblem;

public class DailyXX {

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

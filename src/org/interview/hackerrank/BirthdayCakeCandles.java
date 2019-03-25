package org.interview.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * @author Rahul
 *
 */
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		int[] arr = {2,3,1,3};
		int result = birthdayCakeCandles(arr);
		System.out.println(result);
	}
	
	static int birthdayCakeCandles(int[] ar) {
        //int[] res = new int[100000];
		List<Integer> res = new ArrayList<Integer>();
		
        int count =0;
        for(int x: ar){
        	
        	int elem = res.get(x);
            res.add(x, elem+1);
        }
        
        for(int x: res){
            if(x!=0){
                count = x;
            }
        }
        return count;
    }

}

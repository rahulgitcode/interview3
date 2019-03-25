package com.hmsy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNonRepeating {
	public static void main(String[] args){
		String s = "abcabcbb";
		String out = findLongestSubstring(s);
		System.out.println(out.length());
	}

	private static String findLongestSubstring(String s) {
		Map<Character,Integer> visited = new HashMap<>();
		String output = "";
		
		for(int start=0,end=0; end < s.length(); end++){
			char curr = s.charAt(end);
			
			if(visited.containsKey(curr)){
				start = Math.max(visited.get(curr)+1, start);
			}
			
			if(output.length() < end - start +1){
				output = s.substring(start, end+1);
			}
			visited.put(curr, end);
		}
		return output;
	}
}

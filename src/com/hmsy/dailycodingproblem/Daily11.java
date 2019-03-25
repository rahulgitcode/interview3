package com.hmsy.dailycodingproblem;

import java.util.HashMap;
import java.util.Map;

/**
 * 
Daily Coding Problem: Problem #11 [Medium]

This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

 * @author Rahul
 *
 */
public class Daily11 {

	public static void main(String[] args) {
		String[] arr = {"dog","deer","deal","deals","dealer","door"};
		String query = "de";
		
		
		//Using a HashMap
		Map<String,String> hm = new HashMap<>();
		
		for(String s: arr){
			for(int i=0; i<=s.length(); i++){
				String temp = s.substring(0, i);
				if(hm.containsKey(temp) && !"".equals(temp)){
					String val = hm.get(temp);
					hm.put(temp, val+","+s);
				}else if(!"".equals(temp)){
					hm.put(temp, s);
				}
			}
		}
		
		System.out.println("The query is: "+ query);
		if(hm.containsKey(query)){
			System.out.println("Matching string(s) found: "+ hm.get(query));
		}
		
		
		//Using a Trie Datastructure(More Efficient)
		Trie trie = new Trie();
		
		for(String word : arr){
			trie.insert(word); // construct the trie with words
		}
		
		System.out.println("Matching string(s) found using Trie: "+ trie.findMatchingWords(query));
	}

}

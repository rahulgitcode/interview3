package com.hmsy.dailycodingproblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Another approach to AutoCompleteSystem using a Trie Data structure
 */
public class Trie {
	private TrieNode root;
	
	private class TrieNode{
		Map<Character,TrieNode> children;
		boolean endOfWord;
		
		public TrieNode(){
			children = new HashMap<>();
			endOfWord = false;
		}
	}
	
	public Trie(){
		root = new TrieNode();
	}
	
	public void insert(String word){
		TrieNode current = root;
		for(int i=0; i<word.length(); i++){
			Character ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null){
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}
		current.endOfWord=true;
	}
	
	public boolean search(String word){
		TrieNode current = root;
		for(int i=0; i<word.length(); i++){
			Character ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null){
				return false;
			}else{
				current = node;
			}
		}
		if(!current.endOfWord){
			System.out.println("Not end of word yet");
		}
		return current.endOfWord;
	}
	
	public List<String> findMatchingWords(String word){
		TrieNode current = root;
		List<String> res = new ArrayList<String>();
		for(int i=0; i<word.length(); i++){
			Character ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null){
				break;
			}else{
				current = node;
			}
		}
		
		if(!current.endOfWord){
			Set<Character> keyset = current.children.keySet();
			for(Character c: keyset){
				List<String> s= LoopTillEnd(c, current.children.get(c));
				for(String str: s){
					res.add(word+str);
				}
			}
		}
		return res;
	}

	private List<String> LoopTillEnd(Character c, TrieNode current) {
		List<String> res = new ArrayList<>();
		String buf = c.toString();
		if(current.endOfWord && !current.children.isEmpty()){
			res.add(buf.toString());
			
			Set<Character> keys = current.children.keySet();
			
			for(Character ch: keys){
				List<String> s = LoopTillEnd(ch, current.children.get(ch));
				for(String str: s){
					res.add(buf+str);
				}
			}
			
		}else if(current.endOfWord){
			res.add(buf.toString());
		}else{
			Set<Character> keys = current.children.keySet();
			
			for(Character ch: keys){
				List<String> s = LoopTillEnd(ch, current.children.get(ch));
				for(String str: s){
					res.add(buf+str);
				}
			}
		}
		return res;
	}
}

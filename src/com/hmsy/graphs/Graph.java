package com.hmsy.graphs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	
		private int V;
		
		private LinkedList<Integer> adj[];
		
		private boolean[] visited;
		
		private int distances[];
		
		public Graph(int v){
			V = v;
			adj = new LinkedList[v];
			
			for(int i=0; i< v; i++){
				adj[i] = new LinkedList<Integer>();
			}
			
			visited = new boolean[v];
			
			distances = new int[v];
			Arrays.fill(distances, -1);
			
		}
		
		public void addEdge(int v, int w){
			adj[v].add(w);
		}
		
		public void BFS(int s){
			LinkedList<Integer> queue = new LinkedList<Integer>();
			
			visited[s] = true;
			queue.add(s);
			
			while(!queue.isEmpty()){
				int v = queue.poll();
				System.out.println(v+" ");
				
				Iterator<Integer> itr = adj[v].listIterator();
				
				while(itr.hasNext()){
					int n = itr.next();
					if(!visited[n]){
						visited[n]= true;
						queue.add(n);
						if(distances[n]==-1){
							distances[n]= distances[v]+1;
						}
					}
				}
			}
		}
		
		public void DFSUtil(int v, boolean[] visited){
			visited[v]=true;
			
			System.out.println(v+" ");
			Iterator<Integer> itr = adj[v].listIterator();
			
			while(itr.hasNext()){
				int next = itr.next();
				if(!visited[next]){
					DFSUtil(next, visited);
				}
			}
		}
		
		public void DFS(int v){
			
			DFSUtil(v,visited);
			
		}
	
	public static void main(String[] args){
		
		Graph g = new Graph(9);
		
		/*g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);*/
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		
		g.addEdge(1, 0);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		
		g.addEdge(2, 0);
		g.addEdge(2, 1);
		
		g.addEdge(3, 0);
		g.addEdge(3, 4);
		
		g.addEdge(4, 1);
		g.addEdge(4, 3);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		
		g.addEdge(5, 8);
		g.addEdge(5, 4);
		
		g.addEdge(6, 7);
		g.addEdge(6, 4);
		
		g.addEdge(7, 6);
		g.addEdge(7, 8);
		
		g.addEdge(8, 5);
		g.addEdge(8, 7);
		
		g.BFS(1);
		//g.DFS(0);
		
		for(int x: g.distances){
			System.out.print(x+" ");
		}
		
	}

}

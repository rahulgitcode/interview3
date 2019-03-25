package org.interview.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class HashTables {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        Arrays.sort(magazine);
        Arrays.sort(ransom);
        
        List<String> magList = new LinkedList<String>(Arrays.asList(magazine));
        
        for(String word : ransom){
            if(!magList.remove(word)){
                System.out.print("No");
                return;
            }
        }
        
        System.out.print("Yes");
        
        
    }

}

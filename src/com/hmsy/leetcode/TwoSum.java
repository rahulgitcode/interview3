package com.hmsy.leetcode;

public class TwoSum {
	
	public static void main(String[] args){
		int[] arr = {3,2,4};
		int[] res = twoSum(arr, 6);
		System.out.println(res);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        
        for(i=0; i<nums.length; i++){
            
            for(j=0; j<nums.length; j++){
                if(j!=i && (nums[i]+nums[j])==target){
                    break;
                }
            }
            
            if(j<nums.length && (nums[i]+nums[j])==target)
                break;
        }
        
        int[] res = new int[2];
        res[0] = i;
        res[1] = j;
        return res;
    }
}

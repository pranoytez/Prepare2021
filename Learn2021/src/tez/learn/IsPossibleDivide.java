package tez.learn;

import java.util.Arrays;
import java.util.HashSet;

/* Given an array of integers nums and a positive integer k, 
 * find whether it's possible to divide this array into sets of k consecutive numbers
 * Return True if its possible otherwise return False.
 */

//Algorithm
/*
 *check if the num length is divisible by given K, if not return 
 * 
 */

public class IsPossibleDivide {
	
	public static boolean isPossibleDivide(int[] nums, int k) {
        boolean ans=false;
        
        
        //edge case
        if(nums.length % k != 0 || nums.length < k)
        	return ans;
        
        Arrays.sort(nums);
        int curr=0;
        int startHere=0;
        int prevVal=0;
        
        HashSet<Integer> set = new HashSet<>();
        
        while(curr < nums.length){
        	if(set.size() < 4 & !set.contains(nums[curr])) {
        		if(nums[curr] != prevVal +1)
        			return ans;
        		set.add(nums[curr]);
        		nums[curr] = Integer.MAX_VALUE;
        		curr++;
        	}else if(set.size() ==4) {
        		set.clear();
        		curr=startHere;
        	}else if (set.contains(nums[curr])) {
        		startHere=curr;
        		curr++;	
        	}
        }
        
        return ans;
    }

	public static void main(String[] args) {
		System.out.println(isPossibleDivide(new int[]{1,2,3,3,4,4,5,6}, 4));

	}

}

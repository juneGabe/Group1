package mypack;

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
        int[] nums = {10, 20, 5, 0, -1, 30};
        int targetSum = 50;
        
        
        int[] result = getPair(nums, targetSum);//brute-force
        System.out.println("Two numbers who add upto "+ targetSum + " are " + nums[result[0]] +", " + nums[result[1]] + ",and are present at indices" + result[0] +"," + result[1]);
        
        int[] result2 = getPairOptimized(nums, targetSum);//optimized
        System.out.println("The answer indices are: " + result2[0] + "," + result2[1]);
	}

	private static int[] getPairOptimized(int[] nums, int targetSum) { //optimized
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //Key = Number In the Array , Value=Index where it occured in the array
		int[] results = {-1, -1};
		
		for(int i=0; i<nums.length; i++) {//10:0 , 20:1, 5:2, 0:3, -1:4, 
		   int num = nums[i];	//30
		   int compliment = targetSum - num;//20
		   if(map.containsKey(compliment)) {
			   results[0] = i;
			   results[1] = map.get(compliment);
			   return results;
		   }else {
			   map.put(num, i);
		   }
		}
		
		return results;
	}

	private static int[] getPair(int[] nums, int targetSum) {//brute-force
		int result[] = new int[2];
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				int sum = nums[i] + nums[j];
				if(sum == targetSum) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
		
	}
}

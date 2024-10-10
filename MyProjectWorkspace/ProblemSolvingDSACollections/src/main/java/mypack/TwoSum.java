package mypack;

public class TwoSum {
	public static void main(String[] args) {
        int[] nums = {10, 20, 5, 0, -1, 30};
        int targetSum = 50;
        
        
        int[] result = getPair(nums, targetSum);//brute-force
        System.out.println("Two numbers who add upto "+ targetSum + " are " + nums[result[0]] +", " + nums[result[1]] + ",and are present at indices" + result[0] +"," + result[1]);
        
        int[] result2 = getPairOptimized(nums, targetSum);//optimized
	}

	private static int[] getPairOptimized(int[] nums, int targetSum) { //optimized
		return null;
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

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] nums = {2,7,11,15,2};
		int[] result = twoSum.twoSum(nums, 4);
//		int[] result = twoSum.twoSum_2DArray(nums, 7);
		System.out.println(result);
		if(result!=null) {
			for(int i:result) {
				System.out.print(i);
			}
		}
	}
	
	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2) {
			return null;
		}
		int searchEle;
		Integer searchIndx;
		Map<Integer, Integer> numMap = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			
			searchEle = target-nums[i];
			if(numMap.containsKey(searchEle) && numMap.get(searchEle)!=i) {
				return new int[] { i, numMap.get(searchEle) };
			}
			numMap.put(nums[i], i);//need to add last to pass the condition for duplicate elements in aray
		}
		return null;
	}
	
	public int[] twoSum_2Pass(int[] nums, int target) {
		if (nums == null || nums.length < 2) {
			return null;
		}
		Map<Integer, Integer> numMap = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			numMap.put(nums[i], i);
		}
		int searchEle;
		Integer searchIndx;
		for (int i = 0; i < nums.length-1; i++) {
			searchEle = target - nums[i];
			searchIndx = numMap.get(searchEle);
			if (searchIndx != null && searchIndx > i) {
				return new int[] { i, searchIndx };
			}
		}
		return null;
	}
    
    public int[] twoSum_2DArray(int[] nums, int target) {
    	if(nums==null || nums.length<2) {
    		return null;
    	}
    	int length = nums.length;
    	int[][] numsMap = new int[length][2];
    	for(int i=0;i<nums.length;i++) {
    		numsMap[i][0]=nums[i];
    		numsMap[i][1]=i;
    	}
    	int searchEle;
    	int searchIndex;
    	for(int i=0;i<nums.length-1;i++) {
    		searchEle = target-nums[i];
    		searchIndex=numsMap[i][1];
    		if(numsMap[i][0] == searchEle && searchIndex>i) {
    			return new int[] {i, numsMap[i][1]};
    		}
    	}
    	return null;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

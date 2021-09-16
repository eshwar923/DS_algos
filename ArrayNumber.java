
public class ArrayNumber {
	private static int[] addArrayNum(int[] nums) {
		if(nums==null || nums.length==0) {
			return nums;
		}
		int sum = 0;
		int l = nums.length;
		for(int i=0; i<l;i++) {
			sum=sum+(nums[i]*((int)Math.pow(10, l-i-1)));
		}
		sum++;
		if(sum/((int)Math.pow(10, l))!=0) {
			l++;
			nums = new int[l];
		}
		for(int i=l-1;i>=0;i--) {
			nums[i]=sum%10;
			sum/=10;
		}
		return nums;
	}
	
	
	private static int[] addArrayNum_carry(int[] nums) {
		if(nums==null || nums.length==0)
			return nums;
		
		int[] addedArr = new int[nums.length];
		int maxIndex = nums.length-1;
		int sum;
		int carry=1;
		for(int i=maxIndex; i>=0; i--) {
			sum = nums[i]+carry;	
			addedArr[i]=sum%10;
			carry = sum==10?1:0;
		}
		if(carry==1) {
			addedArr = new int[nums.length+1];
			addedArr[0]=1;
		}
		return addedArr;
	}
	
	public static void main(String[] args) {
		int[] nums = addArrayNum_carry(new int[] {9,9,9});

		for (int i : nums)
			System.out.print(i);

	}

	
	
	
	
	
	
	
	
	
	
}

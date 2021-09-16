public class BinarySearch {
	
	public static void main(String[] args) {
		int[] sortedArr = {2,5,7,12,37,58,61,79,109,899,1000,1001,8888};
//		System.out.println(search(sortedArr, 900));
//		int[] sortedArr = {1,2};
		System.out.println(binSearch(sortedArr, 900));//Failure scenario is givng logn+1
//		System.out.println(binSearchRecursion(sortedArr, 899, 0, 12, 6));//Failure scenario is givng logn+2
	}

	static int binSearch(int[] sortedArr, int searchEle) {
		int count = 0;
		if (sortedArr == null || sortedArr.length == 0) {
			return -1;
		}
		System.out.println("array length: " + sortedArr.length);
		int maxIndex = sortedArr.length - 1;
		int minIndex = 0;
		while (minIndex <= maxIndex) {
			int midIndex = (minIndex + maxIndex) / 2;
			if (sortedArr[midIndex] == searchEle) {
				return midIndex;
			} else if (sortedArr[midIndex] < searchEle) {
				minIndex = midIndex + 1;
			} else if (sortedArr[midIndex] > searchEle) {
				maxIndex = midIndex - 1;
			}
			System.out.println("count: " + ++count);
		}

		return -1;
	}
	
	static int binSearchRecursion(int[] sortedArr, int searchEle, int minIndex, int maxIndex, int midIndex) {
		System.out.println("binSearchRecursion");
		if (sortedArr == null || sortedArr.length == 0) {
			return -1;
		}
		if (minIndex <= maxIndex) {
			if (sortedArr[midIndex] == searchEle) {
				return midIndex;
			} else if (sortedArr[midIndex] < searchEle) {
				minIndex = midIndex + 1;
			} else if (sortedArr[midIndex] > searchEle) {
				maxIndex = midIndex - 1;
			}
			midIndex = (minIndex + maxIndex) / 2;
			return binSearchRecursion(sortedArr, searchEle, minIndex, maxIndex, midIndex);
		}
		return -1;
	}
	
	
	
	
	
	
	
	static boolean search(int[] sortedArr, int searchEle) {
		boolean isEleExists = false;
		
		if(sortedArr!=null && sortedArr.length>0) {
			System.out.println(sortedArr.length);
			int maxIndex = sortedArr.length-1;
			
			int i =0;
			while(maxIndex>0 && i<maxIndex) {
				if(sortedArr[i]>searchEle || sortedArr[maxIndex]<searchEle) {
					return false;
				}
				int midIndex = (i+maxIndex)/2;
				if(sortedArr[i]==searchEle || sortedArr[maxIndex]==searchEle || sortedArr[midIndex]==searchEle) {
					return true;
				}else {
					if(searchEle<sortedArr[midIndex]) {
						i++;
						maxIndex = (midIndex)-1;
					}else {
						i = (midIndex)+1;
						maxIndex--;
					}
				}
				System.out.println("i=="+i);
				System.out.println("maxIndex=="+maxIndex);
			}
		}
		return isEleExists;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

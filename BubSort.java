public class BubSort {
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1,7,6,8,1};
//		int[] arr = {4,3,2,1};
		optimisedBubSort(arr);
		for(int i:arr) {
			System.out.print(i);
		}
	}
	
	static void optimisedBubSort(int[] arr) {
		if(arr==null || arr.length==0) {
			return;
		}
		int count=0;
		boolean isSwapped = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					isSwapped = true;
				}
				System.out.println("count: "+ ++count);
			}
			if (!isSwapped) {
				System.out.println("isSwap:"+isSwapped);
				return;
			}
		}
	}
	
	static void bubSort1(int[] arr) {
		if(arr==null || arr.length==0) {
			return;
		}
		int count =0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swap(arr, i, j);
				}
				count++;
			}
		}
		System.out.println("count: "+count);
	}
	
	private static void swap(int[] arr, int i, int j) {
		int x = arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}

}

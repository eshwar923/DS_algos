public class SelectionSort {
	static void sort(int[] arr) {
		if(arr==null || arr.length==0) {
			return;
		}
		
		int count =0;
		int minValIndex;
		for(int i=0;i<arr.length-1;i++) {
			minValIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minValIndex]>arr[j]) {
					minValIndex=j;
				}
				count++;
			}
			swap(arr, i, minValIndex);
		}
		System.out.println("count: "+count);
	}

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1,7,6,8,1};
//		int[] arr = {4,3,2,1};
		sort(arr);
		for(int i:arr) {
			System.out.print(i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void swap(int[] arr, int i, int j) {
		int x = arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
}

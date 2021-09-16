package com.equilibriumIndex;

import java.util.Arrays;

public class EquilbriumIndex {
//	Input : 2 3 5 1 6 1 3
//	Output : 3
	static int calcEquilbrium_On2(int[] intArr) {
		if(intArr==null || intArr.length<=2) {
			return -1;
		}
		int precedingSum=0;
		int succedingSum=0;
		int maxIndex = intArr.length-1;
		for(int i=1;i<maxIndex-1;i++) {
			for(int k=0;k<i;k++) {
				precedingSum+=intArr[k];
			}
			for(int j=i+1;j<=maxIndex;j++) {
				succedingSum+=intArr[j];
			}
			if(precedingSum==succedingSum) {
				return i;
			}
			precedingSum=0;
			succedingSum=0;
		}
		return -1;
	}
	
	static int calcEquilbrium_On(int[] intArr) {
		if(intArr==null || intArr.length<=1)
			return -1;
		
		int totSum = Arrays.stream(intArr).sum();
		int lSum=0;
		int rSum=0;
		for(int i=0; i<intArr.length;i++) {
			rSum=totSum-lSum-intArr[i];
			if(rSum==lSum)
				return i;
			lSum+=intArr[i];
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] intArr = {2, 3, 5, 1, 6, 1, 3};
		int index = calcEquilbrium_On(intArr);
		System.out.println(index);
		
	}
	
	
	
	

}

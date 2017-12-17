package com;

import java.util.Arrays;

public class Selection_Sort {
	public void selectionSort(int[] a){
		for (int i = 0; i < a.length-1; i++) {
			int minIndex=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[minIndex]>a[j])
					minIndex=j;
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}		
	}
	
	public static void main(String[] args) {
		int[] a={12,8,7,5,2};
		new Selection_Sort().selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
}

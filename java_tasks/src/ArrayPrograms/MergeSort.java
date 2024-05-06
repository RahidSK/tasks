package ArrayPrograms;

import java.util.Arrays;

public class MergeSort {
	public static void divide(int[] arr, int low, int high) {
		if(low>=high)
			return;
		int mid = (high+low)/2;
		
		divide(arr,low,mid);
		divide(arr,mid+1, high);
		
		conquer(arr, low, mid, high);
	}
	
	public static void conquer(int[] arr, int low, int mid, int high) {
		int[] merged = new int[high-low+1];
		
		int idx1 = low;
		int idx2 = mid+1;
		int index = 0;
		
		while(idx1<=mid && idx2<=high) {
			if(arr[idx1]<arr[idx2]) {
				merged[index++] = arr[idx1++];
			}else {
				merged[index++] = arr[idx2++];
			}
		}
		while(idx1<=mid) {
			merged[index++] = arr[idx1++];
		}
		while(idx2<=high) {
			merged[index++] = arr[idx2++];
		}
		
		for(int i=0,j=low;i<merged.length;i++,j++) {
			arr[j] = merged[i];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,2,6,1,8,3,2};
		divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}

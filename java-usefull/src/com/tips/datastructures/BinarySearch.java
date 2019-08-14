package com.tips.datastructures;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(binarySearch(array, 9, 0, 11));
		
		int low = 0, high = array.length - 1;
		
		int target = 7;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			//System.out.println(mid);
			if(target == array[mid]) {
				System.out.println(true);
				break;
			} else if(target > array[mid]) {
				low = mid + 1;
			} else if(target < array[mid]) {
				high = mid - 1;
			}
			
		}
		
		
	}
	
	private static boolean binarySearch(int[] array, int target, int low, int high) {

		int mid = (low + high) / 2;

		if (target == array[mid]) {
			return true;
		}

		if (target < array[mid]) {
			return binarySearch(array, target, low, mid - 1);
		} else if (target > array[mid]) {
			return binarySearch(array, target, mid + 1, high);
		}
		return false;
	}

}

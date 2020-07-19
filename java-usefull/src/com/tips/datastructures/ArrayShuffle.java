package com.tips.datastructures;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		int len = a.length - 1;		
		
		Random r = new Random();
		int count = 6;
		for(int i = len; i >=0; i--) {
			//System.out.println(count);
			a[i] = a[r.nextInt(count--)];
			//System.out.println(count);			
		}
		
		for(int e : a) {
		 System.out.println(e);
		}
		
	}

}

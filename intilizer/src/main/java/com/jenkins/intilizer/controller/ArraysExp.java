package com.jenkins.intilizer.controller;

import java.util.Optional;

public class ArraysExp {
	
	public static void main(String[] args) {
//		int[] values;
//		values=new int[4];
//		System.out.println(values[0]);
//		values[0]=10;
//		System.out.println(values[0]);
//		values[5]=8;
//		System.out.println(values[5]);
//		String[] words=new String[2];
//		for(String word: words) {
//			System.out.println(Optional.ofNullable(word));
//		}
		int[][] arrays= {{1,2,3},{2,3},{2,4,5}};
		//System.out.println(arrays[2][1]);
		
		String[][] words=new String[2][];
		System.out.println(words[0].length);
		words[0]=new String[3];
		words[1]=new String[3];
		System.out.println(words[0].length);
		words[0][1]="Hello";
		System.out.println(words[0][1]);
		
		for(int row=0;row<arrays.length;row++) {
			
			for(int col=0;col<arrays[row].length;col++) {
				System.out.print(arrays[row][col]+ "\t");
			}
			System.out.println();
		}
	}

}

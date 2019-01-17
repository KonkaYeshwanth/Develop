package com.jenkins.intilizer.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExp {
	
	public static void doTings(String type,List<Integer>list) {
		for(int i=0;i< 1E5;i++) {
			list.add(i);
		}
		
		long start=System.currentTimeMillis();
		
		for(int i=0;i< 1E5;i++) {
			list.add(list.size() -100,i);
		}
		
		
		long end=System.currentTimeMillis();
		
		System.out.println("Time taken::"+(end-start)+"ms "+type);
	}
	
	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<>();
		List<Integer> linkedList=new LinkedList();
		doTings("ArrayList", arrayList);
		doTings("LinkedList", linkedList);
		
		
	}

}

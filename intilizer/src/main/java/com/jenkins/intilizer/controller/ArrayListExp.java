package com.jenkins.intilizer.controller;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExp {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			list.remove(i);
		}
	}

}

package com.jenkins.intilizer.controller;

import java.util.ArrayList;
import java.util.List;

class Organization{
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Organization> list(){
		return new ArrayList<Organization>();	}
}
public class OptionalExp {
	
	public static void main(String[] args) {
		Organization o=new Organization();
		List<Organization> list=o.list();
		for(Organization org:list) {
			System.out.println("Name/:::"+org.getName());
		}
		//System.out.println(list.size());
		
	}

}

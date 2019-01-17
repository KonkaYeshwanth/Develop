package com.jenkins.intilizer.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Employe {

	String name;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class ConsumerExp {
	
	static Consumer<?> consumer =i->System.out.println(i);

	static Consumer<Employe> lambdaWrapper(Consumer<Employe> consumer) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (NullPointerException e) {
				System.err.println("Arithmetic Exception occured : " + e.getMessage());
			}
		};
	}
//	static <T, E extends Exception> Consumer<T>
//	  consumerWrapper(Consumer<T> consumer, Class<E> clazz) {
//	  
//	    return i -> {
//	        try {
//	            consumer.accept(i);
//	        } catch (Exception ex) {
//	            try {
//	                E exCast = clazz.cast(ex);
//	                System.err.println(
//	                  "Exception occured : " + exCast.getMessage());
//	            } catch (ClassCastException ccEx) {
//	                throw ex;
//	            }
//	        }
//	    };
//	}

	public static void main(String[] args) {
		List<Employe> list=new ArrayList<>();
		Employe e=new Employe();
		e.setId(1);
		e.setName("Yesh");
		//list.add(e);
		list.forEach(lambdaWrapper(emp-> System.out.println("Emp:::"+emp.getName())));
		System.out.println("Executed ...");
		
		//list.forEach(emp1-> consumer.accept(emp1.getName()));
	}

}

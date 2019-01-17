package com.jenkins.intilizer.controller;

public class CheckedUncheckedExp {

	public static void how() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		try {
			Thread.sleep(11);// throws checked exception fources to handle it
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Below code throws unchecked(runtime) exception not force you to handle it
		/*
		 * int value=7; value= value/0;
		 */

		String[] names = { "Yesh", "ram" };

		try {
			System.out.println(names[2]);
			how();
		} catch (RuntimeException e) {
			System.out.println("Not handled");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Handled");
		}
	}
}
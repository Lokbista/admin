package com.lok;

import java.util.Calendar;

public class JavaPractice {

	public static void main(String[] args) {
		
		JavaPractice ob= new JavaPractice();
		ob.print(2017);
		int i=2;
		int j=0;
			j=(i++ + i++)*--i;
		System.out.println(j);
	
		
	}
	public  boolean print(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, 1, 1);
		int days= cal.getMaximum(Calendar.DAY_OF_MONTH);
		return (days==9);
		
	}
		



}
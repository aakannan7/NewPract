package com.demosite.uat.testref;

public class DateSample {

	public static void main(String[] args) {

		String x1 = "12/02/2020";
		String x11[] = x1.split("/");
		String a = x11[0];
		String b = x11[1];
		String c = x11[2];
		System.out.println(a +" "+ b + " "+ c);

	}

}

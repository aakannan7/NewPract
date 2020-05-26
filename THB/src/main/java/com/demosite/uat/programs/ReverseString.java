package com.demosite.uat.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		
		// >>>>>>>>>>>> Reverse a String using StringBuffer 
		String name = "Malaysia";
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		
		StringBuffer reverseName = buffer.reverse();
		System.out.println(reverseName);
		System.out.println(" ");
		
		// >>>>>>>>>>>> Reverse a String using conversion to charArray
		
		String phone = "Samsung";
		
		char[] phoneCharacters = phone.toCharArray();
		System.out.println("Phone characters are - " + new String(phoneCharacters));
		
		String reversedPhone = "";
		for (int i=phoneCharacters.length-1; i>=0; i--) {
			reversedPhone = reversedPhone + phoneCharacters[i];
		}
		System.out.println(reversedPhone);
		System.out.println(" ");
		
		// >>>>>>>>>>>> Reverse a String using Collection
		String country = "Germany";
		char[] countryChars = country.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		
		for (Character character : countryChars) {
			list.add(character);
		}
		
		Collections.reverse(list);
		
		ListIterator iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			
		}
		System.out.println(" ");
	}

}

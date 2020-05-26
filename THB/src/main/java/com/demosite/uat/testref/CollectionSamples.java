package com.demosite.uat.testref;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionSamples {
	
	public static void main(String[] args) {
		
		HashSet <String> hash = new HashSet<String> ();
		
		hash.add("Apple");
		hash.add("Mango");
		hash.add("Grapes");
		hash.add("Green");
		hash.add("Yellow");
		hash.add("Purple");
		
		System.out.println(hash);
		//hash.clear();
		System.out.println(hash);
		
		Iterator<String> it = hash.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(hash);
		for (String iter : hash) {
			System.out.println(iter);
		}
	}
}

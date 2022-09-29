package com.collection.generics.demo;

import java.util.Arrays;
import java.util.LinkedList;

public class Collection001 {

	public static void main(String[] args) {
		
		
		// create linkedlist
	    LinkedList<String> languages = new LinkedList<>();

	    // Add elements to LinkedList
	    languages.add("C");
	    languages.add("C++");
	    languages.add("Java");
	    languages.add("Kotlin");
	    languages.add("python");
	    languages.add("Perl");
	    languages.add("Ruby");
	    System.out.println("LinkedList: " + languages );
	    

	 // remove elements from index 5
	    String str = languages.remove(5);
	    System.out.println("Removed Element: " + str);

	    System.out.println("Updated LinkedList: " + languages);
	    
	 // remove elements Kotlin
	    languages.remove("Kotlin");
	    
	    // Printing the final elements after removal
        // inside above LinkedList object
        System.out.println(" LinkedList:" + languages);
	
        //remove scripting languages
        LinkedList<String> scripting_languages= new LinkedList<> (Arrays.asList( "Python","Ruby","Perl"));
        languages.remove(scripting_languages);
        System.out.println("After sorting scripting languages:");
        //Printing the final elements
        System.out.println("LinkeList:"+languages);
        
     // Removing all the elements from the linked list
        languages.clear();
     
        System.out.println("The New linked list: " + languages);
	
	}

}

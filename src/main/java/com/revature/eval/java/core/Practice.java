package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.List;

public class Practice {
		
	public static void main(String[] args) {
		
		
	}
	
	public boolean isPangram(String string) {
		String phrase = string.toLowerCase();
		boolean [] keepTrack = new boolean [26];
		int index = 0;
		int marker = 1;
		if (phrase == "") {
			return false;
		} else {
			for (int i = 0; i<phrase.length; i++) {
				if ((phrase.charAt(i)) >= 'a') && (phrase.charAt(i)<='z')){
						index = phrase.charAt(i) - 'a';
				}
			}
		}
			
		
		
		
		
		return false;
	}
	

}











	/*public static boolean isValidIsbn(String string) {
		String phrase = (string.replaceAll("[^0-9X']",""));
		System.out.println(phrase);
		if (phrase.length() != 10) {
			return false;
		} else {
			int sum = 0;
			for (int i=0; i<9; i++) {
				int
			}
		}
		
	}*/

			
	















		/*	char first = word.charAt(0);
			if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
				word = word + "ay";
				System.out.println(word);
				return word;
			} else if (first == 'q') {
				word = word.substring(2) + word.substring(0,2) + "ay";
				System.out.println(word);
				return word;
			} else {
				for (int i=0; i<word.length(); i++) {
					char ch = word.charAt(i);
					if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
						word = word.substring(i)+word.substring(0,i)+"ay";
						System.out.println(ch);
						break;
					} else {
						continue;
					}
				}
			}
		}
		String pigLatin = String.join(",",allWords);
		System.out.println(pigLatin);
		return pigLatin;
	*/


if(Arrays.asList(array).contains(x)){
 
}
package com.xworkz.mapping;

public class Task {

	// find the frequency(occurance) of letter given String
	// input xxworkzz;
	// output x=2,w=1,o=1,r=1,k=1, z=2

	public static void main(String[] args) {

		String str = "xworkzzzzz";

		int[] freq = new int[str.length()];

		int i, j;

		// Converts given string into character array
	
		char[] string1 = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string1[i] == string1[j]) {
					freq[i]++;

					// Set string1[j] to 0 to avoid printing visited character
					string1[j] = '0';
				}
			}
		}

		// Displays the each character and their corresponding frequency
		System.out.println("Characters and their corresponding frequencies");
		for (i = 0; i < freq.length; i++) {
			if (string1[i] != ' ' && string1[i] != ' ');
			
			System.out.println(string1[i] + "-" + freq[i]);
		}
	}

}

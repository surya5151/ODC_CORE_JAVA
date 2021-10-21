package com.xworkz.mobile;

public class MobileStarter {

	public static void main(String[] args) {

		String shashankFavDrink = "Block Dog";

		String vikranthFavDrink = new String("Block Dog");

		String akashFavDrink = "Block Dog";

		String vinayFavDrink = new String("Block Dog");

		String rajShaker = vikranthFavDrink;

		if (vikranthFavDrink == shashankFavDrink) {

			System.out.println("pointing to same memory");
		} else {
			System.out.println("pointing to different memory");
		}

		// equals---->depends on contents

		boolean same = vikranthFavDrink.equals(shashankFavDrink);
		System.out.println(same);

		char[] chars = rajShaker.toCharArray();
		System.out.println(chars.length);

		for (int box = 0; box < chars.length; box++) {
			char c = chars[box];
			System.out.println(c);
		}
		char ch=rajShaker.charAt(4);
		System.out.println(ch);
	}

}

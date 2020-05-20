package TD8.service;

import java.util.*;

public class TestExercices {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] T1 = new int[10];
		String[] T2 = new String[7];
		int[] T3 = {0, 6, 2, 4, 3};
		String[] T4 = {"bleu", "rouge", "blanc", "vert", "mauve", "indigo"};

		/* 1 */	Arrays.fill(T1, 0, 10, 5);
		/* 2 */	Arrays.fill(T2, 1, 3, "bleu");
		
		/* 3 */	System.out.println(Arrays.toString(T1));
		/* 3 */	System.out.println(Arrays.toString(T2));
		
		/* 4 */	Arrays.sort(T3, 0, 5);
		/* 5 */ Arrays.sort(T4, 0, 6);
		
		/*
		 * System.out.println(Arrays.toString(T3));
		 * System.out.println(Arrays.toString(T4));
		 */

		/* 6 */ Arrays.equals(T1, T3);
		/* 7 */ String[] T5 = Arrays.copyOf(T4, 5);//System.out.println(Arrays.toString(T5));
		
		/* 8 */ String[] T6 = Arrays.copyOfRange(T4, 0, 6);//System.out.println(Arrays.toString(T6));
		/* 9 */ List <String> T7 = Arrays.asList(T4); System.out.println(Arrays.toString(T6));


	}

}

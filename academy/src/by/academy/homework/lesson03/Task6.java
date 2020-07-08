package by.academy.homework.lesson03;

import java.util.Scanner;

public class Task6 {
	
	static boolean swapCheck(String s1, String s2) {
		if(s1.length() == s2.length()) {
			int count_1 = 0;
			int count_2 = 0;
			for(int i = 0; i < s1.length(); i++) {
				for(int j = 0; j < s1.length(); j++) {
					if(s1.charAt(i)==s1.charAt(j)) {
						count_1++;
					}
				}
				
				for(int j = 0; j < s2.length(); j++) {
					if(s1.charAt(i) == s2.charAt(j)) {
						count_2++;
					}
				}
				
				if(count_1 != count_2) {
					return false;
				}	
			}
		}
		else {
			return false;
		}
		return true;
		
	}
	
	public static void main(String...strings ) {
		
		System.out.println("Enter two strings:");
		Scanner in = new Scanner(System.in);
		String str_1 = in.nextLine();
		String str_2 = in.nextLine();
		in.close();
		
		System.out.println(swapCheck(str_1,str_2));
	}
}

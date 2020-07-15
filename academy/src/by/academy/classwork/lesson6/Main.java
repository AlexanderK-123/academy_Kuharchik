package by.academy.classwork.lesson6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int n = 0;
		n = in.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < s.length; i++) {
			s[i] = in.nextLine();
		}
		in.close();
		
		String maxStr = s[0];
		int maxLen = s[0].length();
		
		for(String e : s) {
			if(maxLen < e.length()) {
				maxStr = e;
				maxLen = e.length();
			}
		}
		
		System.out.println("MaxStr: " + maxStr + " maxLen: " + maxLen);
	}

}

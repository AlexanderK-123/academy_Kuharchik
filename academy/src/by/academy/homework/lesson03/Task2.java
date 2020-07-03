package by.academy.homework.lesson03;

import java.util.Scanner;

public class Task2 {
	public static void main(String...strings ) {
		
		System.out.println("Enter data type and value:");
		Scanner in = new Scanner(System.in);
		String type = in.nextLine();
		String value = in.nextLine();
		in.close();
		
		switch (type) {
		case "int": 
			try {
				int i = Integer.parseInt(value.trim());
				System.out.println("int: " + i%2);
			}
			catch (NumberFormatException nfe)
		    {
		      System.out.println("NumberFormatException: " + nfe.getMessage());
		    }
			break;
		case "double":
			try {
				double i = Double.parseDouble(value.trim());
				System.out.println("double: " + i*0.7);
			}
			catch (NumberFormatException nfe)
		    {
		      System.out.println("NumberFormatException: " + nfe.getMessage());
		    }
			break;
		case "float":
			try {
				float i = Float.parseFloat(value.trim());
				System.out.println("float: " + i*i);
			}
			catch (NumberFormatException nfe)
		    {
		      System.out.println("NumberFormatException: " + nfe.getMessage());
		    }
			break;
		case "char":
			char[] i = value.toCharArray();
			System.out.println("char: " );
			for(char elem : i) {
				System.out.println(elem + " : " + (int)elem);
			}	
			break;
		case "String": 
			System.out.println("String: Hello " + value);
			break;
		default:
			System.out.println("Unsupported type");
			break;	
		}
	}
}

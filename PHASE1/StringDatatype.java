package phase1_Assistedpractice;
import java.util.Scanner;
public class StringDatatype {
	public static void main(String args[]) { 
			
			System.out.println("Please enter any value"); 
			
			Scanner scnr = new Scanner(System.in); 
			String input = scnr.nextLine(); 
			
			int i = Integer.parseInt(input); 
			long l=Long.parseLong(input);
			float y= Float.parseFloat(input);
			double d=Double.parseDouble(input);
			
			System.out.println("String converted to int : " +  i); 
			System.out.println("String converted to long:  "+  l);
			System.out.println("String converted to float:  "+ y);
			System.out.println("String converted to double:  "+ d);
			
			System.out.println("Please enter another integer number"); 
			String str = scnr.nextLine(); 	
			int j = Integer.valueOf(str);
		}
	}



package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed int String 10 times.
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = s.length()-1; i>=0;i--) {
				 System.out.print(s.charAt(i));
			}
		}, "repeat");
		System.out.println("");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i<s.length(); i++) {
				System.out.print(s.charAt(i));
				System.out.print(".");
			}
		}, "repeat");
		System.out.println("");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int i = 0; i<s.length(); i++) {
				if(s.charAt(i) == 'e' || s.charAt(i) == 'a') {
					
				}
				else {
					System.out.print(s.charAt(i));
				}
			}
		},"repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
